package com.jmll1024;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;

public class ServerSocketDemo {

    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8080));
        serverSocketChannel.configureBlocking(false);
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true) {
            int select = selector.select();
            if (select == 0) {
                continue;
            }

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                if (selectionKey.isAcceptable()) {
                    System.out.println("acceptable");
                    Thread.sleep(1000);

                    SocketChannel socketChannel = serverSocketChannel.accept();
                    if (socketChannel == null) {
                        continue;
                    }
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                }

                if (selectionKey.isReadable()) {
                    System.out.println("Readable");
                    Thread.sleep(1000);
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();

                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

                    int length;

                    while ((length = socketChannel.read(byteBuffer)) != -1) {
                        byteBuffer.flip();
                        if (!byteBuffer.hasRemaining()) {
                            break;
                        }
                        System.out.println(new String(byteBuffer.array(), 0, length, StandardCharsets.UTF_8));
                        byteBuffer.clear();
                    }
                }

                if (selectionKey.isWritable()) {
                    System.out.println("Writable");
                    Thread.sleep(1000);
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();

                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    String html = """
                            <!DOCTYPE HTML>
                            <html>
                            <head>
                                <title>Home</title>
                            </head>
                            <body>
                                <p>Hello</p>
                            </body>
                            </html>
                            """;
                    byteBuffer.put(html.getBytes(StandardCharsets.UTF_8));
                    socketChannel.write(byteBuffer);
                }
                iterator.remove();
            }
        }
    }
}

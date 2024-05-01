package com.jmll1024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketChannelDemo {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8080));
        socketChannel.configureBlocking(false);
        while (true) {
//            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            Scanner scanner = new Scanner(System.in);

//            String line = bufferedReader.readline();
            String line = scanner.nextLine();

            if (line != null && !"".equals(line)) {
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                buffer.put(line.getBytes(StandardCharsets.UTF_8));
                buffer.flip();
                socketChannel.write(buffer);
                buffer.clear();
            }
        }
    }
}

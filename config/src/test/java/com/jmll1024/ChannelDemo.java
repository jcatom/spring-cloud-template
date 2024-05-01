package com.jmll1024;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo {

    public static void main(String[] args) throws Exception {
        FileInputStream readFileInputStream = new FileInputStream(new File("d:\\test.txt"));
        FileChannel readChannel = readFileInputStream.getChannel();
        File file = new File("d:\\test1.txt");
//        if (!file.exists()) {
//            file.createNewFile();
//        }
        FileOutputStream writeFileInputStream = new FileOutputStream(file);
        FileChannel writeChannel = writeFileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int count = -1;
        while ((count = readChannel.read(byteBuffer)) != -1) {
            byteBuffer.flip();
            writeChannel.write(byteBuffer);
            byteBuffer.clear();
        }
        readChannel.close();
        writeChannel.close();
    }
}

package IoAndnio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CharacterStreams {
    private final static File readingFile = new File("/mnt/hdd/Idea/CoreJava/names.txt");
    private final static File writeTo = new File("/mnt/hdd/Idea/CoreJava/write.txt");

    public static void readAFile() throws IOException {
        FileReader reader = new FileReader(readingFile);
        int charReader;
        while ((charReader = reader.read()) != -1) {
            System.out.print((char) charReader);
        }
        reader.close();
    }


    public static void readBuffered() throws IOException {
        try (BufferedReader readThis = new BufferedReader(new FileReader(readingFile))) {
            String line;
            while ((line = readThis.readLine()) != null) {
                System.out.println(line);
            }
        }
    }


    //=================THIS IS PART OF NIO I PUT IT HERE =================

    public static void nioByteBuffer(String message) {
        ByteBuffer bf = ByteBuffer.allocate(1024);
        bf.put(message.getBytes());
        bf.flip();
        while (bf.hasRemaining()){
            System.out.print((char) bf.get());
        }
    }

    public static void nioFileChannel() throws IOException {
        FileChannel fc = FileChannel.open(Paths.get("/mnt/hdd/Idea/CoreJava/names.txt") , StandardOpenOption.READ);
        ByteBuffer buff = ByteBuffer.allocate(1024);
        fc.read(buff);
        buff.flip();
        System.out.println(new String(buff.array(), 0, buff.remaining()));
        fc.close();
    }



}

package socketProgramming;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class SimpleClassOne {
    public static void operate(String message) throws IOException {
        ByteBuffer bf = ByteBuffer.wrap(message.getBytes(StandardCharsets.UTF_8)); /*Heap*/
        bf.put(message.getBytes(StandardCharsets.UTF_8));
        bf.flip();
        Path path = Path.of("/mnt/hdd/Idea/CoreJava/file.txt");
        Files.createFile(path);
        try (FileChannel fc = FileChannel.open(
                path,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        )) {
            fc.write(ByteBuffer.wrap(System.lineSeparator().getBytes(StandardCharsets.UTF_8)));
            fc.write(bf);
        }
    }

    public static void writeFast(Path path, String message) throws IOException {
        Files.write(path, message.getBytes(), StandardOpenOption.WRITE);
    }

    public static void readWithStream(Path path) throws IOException {
        Files.lines(path).forEach(System.out::println);
    }
}

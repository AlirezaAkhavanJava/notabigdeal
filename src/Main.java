import IoAndnio.CharacterStreams;
import socketProgramming.SimpleClassOne;

void main() throws IOException {
    Path path = Path.of("/mnt/hdd/Idea/CoreJava/file.txt");
//    System.out.println(Files.readAllLines(path));
    SimpleClassOne.readWithStream(path);
}

package MyPackage;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;

public class FindInt {
    private Path file;

    FindInt(Path file) {
        this.file = file;
    }

    public int seek() throws IOException {
        int num = -1;

        try (SeekableByteChannel fc = Files.newByteChannel(file)) {

            ByteBuffer buf = ByteBuffer.allocate(8);

            fc.read(buf);
            long offset = buf.getLong(0);

            fc.position(offset);
            buf.rewind();

            fc.read(buf);
            num = buf.getInt(0);
        } catch (IOException x) {
            System.err.println(x);
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        Path file = Paths.get("file.txt");
        int num = new FindInt(file).seek();
        System.out.println("value: " + num);
    }
}

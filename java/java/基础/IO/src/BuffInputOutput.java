
import java.io.*;

public class CopyFileBuffered {
    public static void main(String[] args) {
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("input.txt"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("output.txt"));

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
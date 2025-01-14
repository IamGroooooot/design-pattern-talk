package decorator.ex2_inputstream;

import java.io.*;

class UpperCaseInputStream extends FilterInputStream {
    
    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }
    
    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1) ? c : Character.toUpperCase(c); // 대문자화!
    }
    
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        if (result != -1) {
            for (int i = off; i < off + result; i++) {
                b[i] = (byte) Character.toUpperCase((char) b[i]); // 대문자화!
            }
        }
        return result;
    }
    
}

public class DecoratorExample {
    
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/decorator/ex2_inputstream/example.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             InputStream inputStream = new UpperCaseInputStream(bufferedInputStream)) {
            
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
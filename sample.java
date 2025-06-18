package GitKadai0618_1;

import java.io.FileReader;
import java.io.IOException;

public class sample {

    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("aaa.txt");
            int i = fr.read();

            while (i != -1) {
                char c = (char) i;
                System.out.print(c);
                i = fr.read();
            }

        } catch (IOException e) {
            System.out.println("エラー: " + e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("クローズエラー: " + e.getMessage());
                }
            }
        }
    }
}

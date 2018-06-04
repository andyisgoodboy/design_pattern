package decoratorpattern.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by andy on 18/6/4.
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream("/Users/yoken/IdeaProjects/design_pattern/src/main/resources/test.txt")));
            while ((c = in.read()) > 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

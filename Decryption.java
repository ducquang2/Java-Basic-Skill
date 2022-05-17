import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */

    public static String decryptMessage(String encryptedMessage) {
        String[] temp = encryptedMessage.split(" ");
        Stack<String> test = new Stack<>();
        Character small = new Character('t');
        for (int i = temp.length - 1; i >= 0; i--) {
            char alo[] = temp[i].toCharArray();
            for (int j = 0; j < alo.length - 1; j++) {
                for (int j2 = j + 1; j2 < alo.length; j2++) {
                    if (alo[j] == alo[j2] && alo[j] != '0')
                    {
                        alo[j2] = '2';
                    }
                }
            }
            for (int j = 0; j < alo.length; j++) {
                small = alo[j];
                test.push(small.toString());
            }
            test.push(" ");
            // test.push("test ");
        }
        String done = "";
        for (int i = 0; i < test.size(); i++) {
            done += test.get(i);
        }
        return done;
    }

}

public class Decryption {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String encryptedMessage = bufferedReader.readLine();

        String result = Result.decryptMessage(encryptedMessage);

        System.out.println(result);
        bufferedReader.close();
    }
}

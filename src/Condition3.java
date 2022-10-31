import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Condition3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str);

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
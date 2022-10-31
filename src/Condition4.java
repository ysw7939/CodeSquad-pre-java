import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Condition4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (0 < a) {
            if (0 < b) {
                System.out.println(1);
            }else {
                System.out.println(4);
            }
        } else {
            if (0 > b) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        }
    }
}
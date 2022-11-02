import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= a; ++i) {
            str.append("*".repeat(Math.max(0, i)));
            System.out.println(str);
            str = new StringBuilder();
        }
    }
}
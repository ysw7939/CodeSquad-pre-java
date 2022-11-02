import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Add {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        int result = 0;


        for (int i = 0; i < a; ++i) {
            result += Integer.parseInt(str[i]);
        }
        System.out.println(result);
    }
}
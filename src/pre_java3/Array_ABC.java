package pre_java3;

import java.util.ArrayList;

public class Array_ABC {
    public static void main(String[] args)
    {

        char[] arr = new char[26];

        for(int i=0;i<arr.length;i++) {
            arr[i] = (char)(65+i);
        }

        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

    }
}

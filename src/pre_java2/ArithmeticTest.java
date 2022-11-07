package pre_java2;

public class ArithmeticTest {
    public static void main(String[] args) {
        Arithmetic test = new Arithmetic();

        test.Add();
        System.out.println(test.showResultInfo());


        test.Minus();
        System.out.println(test.showResultInfo());

        test.Multiplication();
        System.out.println(test.showResultInfo());

        test.division();
        System.out.println(test.showResultInfo());


    }
}

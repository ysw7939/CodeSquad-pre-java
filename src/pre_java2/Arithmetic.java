package pre_java2;

public class Arithmetic {
    public int a = 10;
    public int b = 2;
    public int result;

    public void Add() {
        result = a+b;
    }
    public void Minus() {
        result = a-b;
    }
    public  void Multiplication() {
        result = a*b;
    }
    public void division() {
        result = a/b;
    }

    public int showResultInfo() {
        return result;
    }

}

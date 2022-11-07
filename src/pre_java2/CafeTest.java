package pre_java2;

public class CafeTest {
    public static void main(String[] args) {
        Customer james = new Customer("James", 5000);
        james.takeAmericano();
        System.out.println(james.showInfo());

        Customer tomas = new Customer("Tomas", 10000);
        tomas.takeLatte();
        System.out.println(tomas.showInfo());
    }
}

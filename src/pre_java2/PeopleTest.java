package pre_java2;

public class PeopleTest {
    public static void main(String[] args) {
        People peopleJ = new People("제인");
        peopleJ.personAge = 30;
        peopleJ.gender = "여성";
        peopleJ.married = "기혼자";
        peopleJ.child = 1;

        System.out.println(peopleJ.showPersonInfo());
    }
}

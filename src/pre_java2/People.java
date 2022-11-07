package pre_java2;

public class People {

    public String personName;
    public int personAge;
    public String gender;
    public String married;
    public int child;

    public People(String personName) {
        this.personName = personName;
    }
    public String showPersonInfo() {
        return "이름은 " + personName + "이고 나이는 " + personAge + "살 입니다. 성별은 " + gender + "이며, " + married + "입니다. 자녀는" + child + "명이 있습니다.";
    }
}

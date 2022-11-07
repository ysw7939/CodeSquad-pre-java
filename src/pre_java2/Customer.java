package pre_java2;

public class Customer {
    public String customerName;
    public int cash;

    public String info;

    StarCafe starCafe = new StarCafe();
    BeenCafe beenCafe = new BeenCafe();
    public Customer(String customerName, int cash){
        this.customerName = customerName;
        this.cash = cash;
    }

    public void takeAmericano(){
        info = starCafe.Americano();
        this.cash -= 4000;
    }
    public void takeLatte(){
        info = beenCafe.Latte();
        this.cash -= 5000;
    }

    public String showInfo() {
        return customerName + "님의 남은 돈은 " + cash + "원 입니다." + info;
    }
}

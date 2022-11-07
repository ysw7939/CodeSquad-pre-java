package pre_java2;

import java.util.Calendar;

public class MyDate {
    public int day;
    public int month;
    public int year;

    Calendar cal = Calendar.getInstance();

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String isValid() {
        cal.set(year,month,day);
        if(day <= Calendar.DAY_OF_MONTH) {
            return year + "년" + month + "월 " + day + "일은 유효한 날짜입니다.";
        } else {
            return year + "년" + month + "월 " + day + "일은 유효하지 않은 날짜입니다.";
        }
    }
}

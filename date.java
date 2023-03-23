import java.util.Date;
import java.time.*;
/*public class date {
    public static void main(String[] args) {
       System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d.toString());*/
public class date{

public static void main(String[]args){
LocalDate date =LocalDate.now();
LocalDate yesterday=date.minusDays(1);
LocalDate tomorrow=date.plusDays(1);
System.out.println("Todaydate:"+date);
System.out.println("Yesterdaydate:"+yesterday);
System.out.println("Tommorowdate:"+tomorrow);

LocalDate date1=LocalDate.of(2017,1,13);
System.out.println(date1.isLeapYear());

}
}


    


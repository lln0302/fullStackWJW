import java.util.Date;
import java.text.SimpleDateFormat;

public class Time1 { 
   private int hour;
   private int minute;
   private int second;
    
public int getHour(){
   return hour;
}

public void setHour(int hour){
   if (hour <0 || hour >23)
   return;        
   this.hour = hour;
}

public int getMinute() {
   return minute;
}

public void setMinute(int minute) {
   if (minute < 0 || minute > 59)
   return;
   this.minute = minute;
}

public int getSecond() {
   return second;
}

public void setSecond(int second) {
   if (second <0 || second >59)
   return;
   this.second = second;
}
}

public class TimeTest{
   public static void main(String[] args) {
      Time t = new Time(12, 35,30);
      System.out.println(t);
      t.setHour(t.getHour()+1);
      System.out.println(t);      
   }
}

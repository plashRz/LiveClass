import java.util.Calendar;

public class liveClass {
    //Static block
    static {

        System.out.println("world from static block");
    }
    public static void main(String[] args){

        System.out.println("Hello");

        char k = 'a'+1;
        k = (char) (k + 2);
        System.out.println(k);

        outPuty();

        liveClass l = new liveClass();
        l.outPuty1();

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

    }
    public static void outPuty (){
        System.out.println("hello");
    }

    public void outPuty1 (){
        System.out.println("hello from live class 1");
    }
}

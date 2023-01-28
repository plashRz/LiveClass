public class liveClass2 extends liveClass {

    public static void main(String[] args) {

        liveClass obj1 = new liveClass2();
        obj1.outPuty1();
        //  liveClass2 x = (liveClass2) obj1;
        // x.outPuty1();
        liveClass obj2 = new liveClass();
        obj2.outPuty1();


    }

    public void outPuty1 (){
        System.out.println("hello from class 2");
        //super.outPuty1();
    }
}

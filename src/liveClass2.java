public class liveClass2 extends liveClass {

    public static void main(String[] args) {

        liveClass obj1 = new liveClass2();
        obj1.outPuty1();


    }

    public void outPuty1 (){
        System.out.println("hello from class 2");
        super.outPuty1();
    }
}

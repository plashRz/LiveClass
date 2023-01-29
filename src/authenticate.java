import java.util.Scanner;

public class authenticate {

    //////DATA PART
    private String[] users = {"user1","user2","user3",
            "user4","user5"};
    private String[] pass = {"pass1","pass2","pass3",
            "pass4","pass5"};
    //////

    public static void main(String[] args) {

        //Declare and initializations
        authenticate auth = new authenticate();
        Scanner scan = new Scanner(System.in);
        String uName,pWord;
        int x=0,flag=0;

        //Input from user
        System.out.println("=========================");
        System.out.println("Enter username:");
        uName= scan.nextLine();
        System.out.println("Enter password:");
        pWord= scan.nextLine();

        //Comparison
        while (x<auth.getUsers().length){
            // if input username is equal to username or password we have stored.
            if(auth.getUsers()[x].equals(uName) && auth.getPass()[x].equals(pWord)){
                flag=1;
            }
            //increasing count so that we are not stuck in infinite loop.
            x++;
        }

        //flag comparison for print instead of printing multiple times
        if(flag==1) {
            System.out.println("Welcome " + uName + " to the jungle");
        } else {
            System.out.println("invalid username or password");
        }

    }



    //Getters to access data
    public String[] getUsers() {
        return users;
    }

    public String[] getPass() {
        return pass;
    }
}

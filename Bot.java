import java.util.Scanner;

public class Bot {
    //your code goes here
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again". 
    */
    public static void main(String[] args) {
        bot();
    }

    public static void bot (){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1:
            System.out.println("Order confirmed");
            break;
            case 2:
            System.out.println("info@sololearn.com");
            break;
            default:
            System.out.println("Try again");
        }
    }
}
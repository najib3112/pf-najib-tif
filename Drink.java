import  java.util.Scanner;

public class Drink {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choice = sc.nextInt();
        
        if(choice < 0 || choice > 4){
            System.out.print("Invalid");

        } else{
            System.out.print(menu[choice]);
        }
    }

}
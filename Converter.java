import java.util.Scanner;

public class Converter {
    //your code goes here
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double foot = sc.nextDouble(); 

        convert(foot);
    }
    static void convert(double foot){
        System.out.print(foot * 12);
    }
}
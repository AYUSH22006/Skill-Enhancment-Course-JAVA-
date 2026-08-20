import java.util.Scanner;

public class table {
    public static void main(String[] args) {
           System.out.print("Table of Number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        for ( int i=1 ; i<11 ; i++) {
            System.out.println(number+"x"+i+"="+i*number);
        }
        
    }
    
}
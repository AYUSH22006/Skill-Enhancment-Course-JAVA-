import java.util.*;
public class count_evenodd_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int even=0, odd=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
    
}

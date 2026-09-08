import java.util.*;
public class count_uper_lower_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int countupper = 0;
        int countlower = 0;
        int countdigit = 0;
        int countspace = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if (Character.isUpperCase(ch)){
                countupper++;
            }
            else if (Character.isLowerCase(ch)){
                countlower++;
            }
            else if (Character.isDigit(ch)){
                countdigit++;
            }
            else if (Character.isWhitespace(ch)){
                countspace++;
            }
           

        System.out.println("Upper"+countupper);
        System.out.println("Lower"+countlower);
        System.out.println("Digit"+countdigit);
        System.out.println("Space"+countspace);

        }

    }
}

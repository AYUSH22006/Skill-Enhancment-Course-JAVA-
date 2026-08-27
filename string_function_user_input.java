import java.util.*;
public class string_function_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of the string: " + str.length());
        System.out.println("First character of the string: " + str.charAt(0));
        System.out.println("Substring from index 5: " + str.substring(5));
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());
        System.out.println("Does the string contain 'Java'? " + str.contains("Java"));
        System.out.println("Does the string start with 'Hello'? " + str.startsWith("Hello"));
        System.out.println("Does the string end with 'Java'? " + str.endsWith("Java"));
        System.out.println("Index of 'Java' in the string: " + str.indexOf("Java"));
        System.out.println("Does the string is equal: " + str.equals(str));
    }
    

    
}

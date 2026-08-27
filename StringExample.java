public class StringExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(5));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.contains("Java"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("Java"));
        System.out.println(str.indexOf("Java"));
    }
}
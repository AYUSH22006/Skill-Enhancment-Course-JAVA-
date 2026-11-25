class Login_MO {

    public void login(String user) {
        System.out.println("User: " + user);
    }

    public void login(String user, String pwd) {
        System.out.println("User: " + user);
        System.out.println("Password: " + pwd);
    }

    public void login(String user, String pwd, int otp) {
        System.out.println("User: " + user);
        System.out.println("Password: " + pwd);
        System.out.println("OTP: " + otp);
    }

    public static void main(String[] args) {
        Login_MO a = new Login_MO();

        a.login("Alagu");
        a.login("Alagu", "abc123");
        a.login("Alagu", "abc123", 1234);
    }
}
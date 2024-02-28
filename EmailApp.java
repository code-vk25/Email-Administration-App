package emailApp;

public class EmailApp {
    public static void main(String[] args) throws Exception {
        
        Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());
    }
}

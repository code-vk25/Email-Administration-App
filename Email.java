package emailApp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String department;
    private String email;
    private String company = "aescompany.com";
    private String password;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int passwordLength = 8;

    // constructor to recieve the first and the last name
    Email(String name1, String name2) {
        this.firstname = name1;
        this.lastname = name2;

        System.out.println("EMAIL CREATED : " + this.firstname + " " + this.lastname);

        this.department = setDepartment();
        this.password = randomPassword(passwordLength);

        // Email generation
        this.email = firstname.toLowerCase()+ "." + lastname.toLowerCase() + "@" + department + "." + company;
     
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("New Worker: " + firstname + "\nDepartment Codes : \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None\nChoose department :\n ");
        Scanner sc = new Scanner(System.in);
        int deptNo = sc.nextInt();
        if (deptNo == 1) {
            return "Sales";
        } else if (deptNo == 2) {
            return "Dev";
        } else if (deptNo == 3) {
            return "Accounting";
        } else {
            return "None";
        }
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void  setMailboxCapacity(int newCapacity){
        this.mailboxCapacity = newCapacity;
    }

    // set the alternate Email
    public void setAlternateEmail(String newEmail){
        this.alternateEmail = newEmail;
    }

    // change the password
    public void setNewPassword(String newPassword){
        this.password = newPassword;
    }

    // Get methods
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}
    public int getMailboxCapacity(){return mailboxCapacity;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstname + " " + lastname + "\n" +
                "COMPANY EMAIL: " + email + "\n" +
                "PASSWORD: " + password + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapacity + "mB\n";
    }
}

    
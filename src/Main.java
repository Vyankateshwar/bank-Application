import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name,password & balance to create a account");
        Scanner sc = new Scanner(System.in);

        //create account
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name,balance,password);
        //add amount
        System.out.println("enter amount you want to add");
        int money=sc.nextInt();
        System.out.println(user.addMoney(money));

        //withdraw money
        System.out.println("enter money you want to withdraw");
        int money1 = sc.nextInt();
        System.out.println("enter password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money1,pass));

        //calculate interest
        System.out.println("enter years to calculate interest");
        int years =sc.nextInt();
        System.out.println(user.calculateInterest(years));
    }
}
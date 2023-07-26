import java.util.Scanner;



public class Bank {
    private String name;
    private String type;
    private double balance;
    private Integer idnumber;
    Scanner sc = new Scanner(System.in);

    public Bank(String n, String t, double s, int i){
        name = n;
        type = t;
        balance = s;
        idnumber = i;
    }

    public void showInformation(){
        System.out.println("Full Name: " + name);
        System.out.println("Banking Type: " + type);
        System.out.println("Deposited Money: $" + balance);
        System.out.println("Identification Number: " + idnumber);
    }

    public Integer getIDNumber(){
        return idnumber;
    }

    public void depositMoney(int id, Scanner sc){
        System.out.print("Enter a deposit: ");

        double deposit = sc.nextDouble();

        balance += deposit;
    }

    public void withdrawMoney(int id, Scanner sc){
        System.out.print("Enter a withdraw: ");

        double withdraw = sc.nextDouble();

        if(balance >= withdraw){
            balance -= withdraw;
        }
        else{
            System.out.println("Withdraw request more than current balance!");
        }
    }

}

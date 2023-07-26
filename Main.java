import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    ArrayList <Bank> accounts = new ArrayList<Bank>();

    System.out.println("Welcome to Banking Application.");

    System.out.println("What would you like to do?");

    System.out.println(UI.bankingIntro());

    int choice = sc.nextInt();

    while(choice != 6){

        switch(choice){

        case 1:

        System.out.println("Enter required information");
        
        String filler = sc.nextLine();

        System.out.print("Enter full name: ");
        String name = sc.nextLine();

        System.out.println(UI.bankingType());

        int banking = sc.nextInt();

        String type = "";

        if(banking == 1){
            type = "Checking";
        }
        else if(banking == 2){
            type = "Savings";
        }
        else if(banking == 3){
            type = "Money Market Account";
        }
        else if(banking == 4){
            type = "Certificate of Deposit";
        }
        

        System.out.print("Enter balance: ");
        double depo = sc.nextDouble();
        System.out.print("Enter identification number: ");
        Integer id = sc.nextInt();

        Bank acc = new Bank(name, type, depo, id);
        accounts.add(acc);

        System.out.println("Bank account created!");
        System.out.println(UI.bankingIntro());

        choice = sc.nextInt();
        break; 

        
        case 2:

        System.out.print("Enter I.D Number: ");
        Integer search = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getIDNumber().equals(search)){
                found = true;
                accounts.get(i).showInformation();
                break;
            }

        }

        if(found == false){
            System.out.println("I.D not found!");
            break;
        }

        System.out.println(UI.bankingIntro());

        search = sc.nextInt();
        break;


        case 3:
        
        if(accounts.isEmpty() == true){
            System.out.println("Account Size is Empty! Enter an Account");
        }
        else
        {
            for(int i = 0; i < accounts.size(); i++){
            System.out.println("# " + accounts.get(i).getIDNumber());
        }

        }

        System.out.println(UI.bankingIntro());

        choice = sc.nextInt();

        break;

        
        case 4:
        
        System.out.println("Which account do you want to access?");

        int num = sc.nextInt();
        found = false;

        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getIDNumber().equals(num)){
                found = true;
                accounts.get(i).depositMoney(i, sc);
                break;
            }
        }

        if(found == false){
            System.out.println("I.D not found!");
            break;
        }

        System.out.println(UI.bankingIntro());

        choice = sc.nextInt();
        break;

        case 5:
        
        System.out.println("Which account do you want to access?");

         num = sc.nextInt();
        found = false;

        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getIDNumber().equals(num)){
                found = true;
                accounts.get(i).depositMoney(i, sc);
                break;
            }
        }

        if(found == false){
            System.out.println("I.D not found!");
            break;
        }

        System.out.println(UI.bankingIntro());

        choice = sc.nextInt();
        break;
    }
    }

    }
    }

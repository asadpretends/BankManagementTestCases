package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        String user_name="Asad",type;
        type = null;
        int balance=1000,tmp=0;
        int withd=0;
        double cb=0;
// to generate Random Account Number 
        int aNumber = 0000;


        create_account user = new create_account("Asad",0,0,"savings"); // initilaize -- name,aNumber,Balance,Type

        Scanner in = new Scanner(System.in);
        Scanner strng=new Scanner(System.in);
        int userChoice;
        boolean quit = false;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Zakat");
            System.out.println("0. to quit: \n");
            System.out.print("Enter Your Choice : ");
            userChoice = in.nextInt();
            switch (userChoice) {

                case 1:
                    System.out.print("Enter your Name : ");
                    user_name=strng.nextLine();
                    System.out.print("Enter Accout Type : ");
                    type=in.next();
                    user.insert("Asad", 0000, "Savings");  // inserted
                    System.out.println("\n\tYour Account Details\n\tDont Forget Account Number\n");
                    System.out.println("**************************");
                    user.displayAccountDetails();
                    break;

                case 2: // deposit
                    System.out.print("Enter your account Number : ");
                    tmp=in.nextInt();
                    if(tmp==user.aNum){
                        System.out.print("Enter Amount Of Money : ");
                        balance=in.nextInt();
                        user.aBal=balance;
                        System.out.println("\t Successfully depositd.");
                    }
                    else
                        System.out.println("Wrong Accoount Number.");
                    break;

                case 3: // withdraw money
                    System.out.print("Enter your account Number : ");
                    tmp=in.nextInt();

                    if(tmp==user.aNum){
                        if(user.aBal==0)
                            System.out.print("Your Account is Empty.");

                        else{
                            System.out.print("Enter Amout Of Money : ");
                            withd=in.nextInt();

                            if(withd>user.aBal){
                                System.out.print("Enter Valid Amout of Money : ");
                                withd=in.nextInt();
                            }
                            else
                                cb= user.withdraw(withd);
                            System.out.println("Your Current Balance : "+cb);
                        }
                    }
                    else
                        System.out.println("Wrong Accoount Number.");
                    break;

                case 4: // check balance

                    System.out.print("Enter your Account Number : ");
                    tmp=in.nextInt();

                    if(tmp==user.aNum){
                        System.out.println("Your Current Balance : "+user.aBal);
                    }
                    else
                        System.out.println("Wrong Accoount Number.");
                    break;

                case 5: // display all info

                    System.out.print("Enter your Account Number :");
                    tmp=in.nextInt();
                    if(tmp==user.aNum){
                        user.displayAccountDetails();
                    }else
                        System.out.println("Wrong Accoount Number.");

                    break;

                case 6: //Zakat
                    System.out.print("Enter you account number:");
                    tmp=in.nextInt();
                    user.calculateZakat();
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong Choice.");
                    break;
            }
            System.out.println("\n");
        } while (!quit);
        System.out.println("Thanks !");

    }

} 
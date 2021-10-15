import java.util.Scanner;

class Account {
    public String acc_name;
    public int acc_no;
    public int acc_type;
    public float balance;

    public void getdata(String name, int no, int type, float bal) {
        acc_name = name;
        acc_no = no;
        acc_type = type;
        balance = bal;
    }

    public void deposit(float amt) {
        balance =  (balance + amt);
        System.out.println("Total Balance is : " + balance);
    }
    public String checkType(int acntype){
        if (acntype==0)
            return "Savings Account";
        else
            return "Current Account";
    }
    public void display() {

        System.out.println("\t Account Information ");
        System.out.println(" Customer Name : " + acc_name);
        System.out.println(" Account no. : " + acc_no);
        System.out.println(" Type of Account : " + checkType(acc_type) );
        System.out.println(" Total Balance : " + balance);
    }
}

class Savings extends Account {

    public void withdraw(float amt) {

        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Total Balance is : " + balance);
        } else {
            System.out.println("\n Insufficient balance\nThe ammount can't be withdrawn\n");
        }
    }

    public void interest(int time) {
        float rate = 6;
        float intr;
        intr =  balance*rate*time/100;
        System.out.println("Intertest calculated is : " + intr);
        balance = balance + intr;
        System.out.println("The new balance is : " + balance);
    }

}

class Current extends Account {

    public int min_bal(float amt) {
        int penal;
        if ((balance-amt) <= 1000) {
            penal = 50;
            balance = balance - penal;
            System.out.println("Penality imposed RS 50 deducted from your account");
            System.out.println("Current Balance is "+balance);
            return 0;
        } else {
            System.out.println("\n NO penality imposed");
            return 1;
        }
    }

    public void withdraw(float amt) {
        int k = min_bal(amt);
        if (k == 1) {
            if (balance >= amt)
                balance = balance - amt;
            System.out.println(" Ammount withdraw Succesfully !!! ");
        } else {
            System.out.println("\n The amount cannot be Withdraw ");
        }
    }

}

class Bank {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float amt = 0;
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("\nEnter Account no. : ");
        int no = sc.nextInt();
        System.out.print("\nSelect Account Type :\n0 : for SAVINGS ACCOUNT\n1 : for CURRENT ACCOUNT\n");
        System.out.print("Enter Selection : ");
        int type = sc.nextInt();
        int temp, temp2;
        if (type == 0) {
            Savings s = new Savings();
            s.getdata(name, no, type, amt);
            do {
                System.out.println("\n****** MENU ******");
                System.out.println(
                        "\n 1. Deposit\n 2. Withdraw\n 3. Interest\n 4. Display Account inforamtion\n 5. Exit");
                temp = sc.nextInt();
                if (temp == 1) {
                    System.out.print("Enter Amoumt to be Deposited : ");
                    float amt1 = sc.nextFloat();
                    s.deposit(amt1);
                } else if (temp == 2) {
                    System.out.print("Enter Amoumt to be Withdraw : ");
                    float amt1 = sc.nextFloat();
                    s.withdraw(amt1);
                } else if (temp == 3) {
                    System.out.print("Enter time period : ");
                    int tp = sc.nextInt();
                    s.interest(tp);
                } else if (temp == 4) {
                    s.display();
                } else if (temp == 5) {
                    System.out.println(" \n Successfully EXITED , THANK YOU !!!\n");
                    System.exit(0);
                } else {
                    System.out.println("\nINVALID INPUT ENTERED PLEASE TRY AGAIN ");
                }
            } while (true); // while (temp != 5);
        } else if (type == 1) {
            Current c = new Current();
            c.getdata(name, no, type, amt);
            System.out.println("\nSince its current account you need first deposit and maintain a Minimum balance of RS 1000 in your Account\n");
            do {
                System.out.println("\n****** MENU ******");
                System.out.println("\n 1. Deposit\n 2. Withdraw\n 3. Display Account Information\n 4. Exit");
                temp2 = sc.nextInt();
                if (temp2 == 1) {
                    System.out.print("Enter Amoumt to be Deposited : ");
                    float amt1 = sc.nextFloat();
                    c.deposit(amt1);
                } else if (temp2 == 2) {
                    System.out.print("Enter Amoumt to be Withdraw : ");
                    float amt1 = sc.nextFloat();
                    c.withdraw(amt1);
                } else if (temp2 == 3) {
                    c.display();
                } else if (temp2 == 4) {
                    System.out.println(" \n Successfully EXITED , THANK YOU !!!\n");
                    System.exit(0);
                } else {
                    System.out.println("\nINVALID INPUT ENTERED PLEASE TRY AGAIN ");
                }
            } while (true); // while (temp2 != 4);
        } else {
            System.out.println("\nInvalid Account Type Selected \n");
        }
        sc.close();
    }
}
package finalTest;

import java.util.Scanner;

public class Bank {
    private static int IDCounter=0;
    private String Name;
    private double Saving;
    private int ID;
    private String password;

    public Bank() {
        IDCounter +=1;
        ID = IDCounter;
    }
    public Bank(String Name, double Saving) {
        this.Name = Name;
        this.Saving = Saving;
        IDCounter +=1;
        ID = IDCounter;
    }

    public void setName(String Name) {
        this.Name=Name;
    }
    public void setSaving(double Saving) {
        this.Saving=Saving;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public double getSaving() {
        return Saving;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return Name+"("+ID+")"+": "+Saving;
    }

    public void Withdraw(double M ) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter password");
        String password = x.nextLine();
        if(password==this.password) {
            if (this.Saving >= M) {
                this.Saving -= M;
            } else {
                System.out.println("This account " + ID + " do not have enought money");
            }
        }else{
            System.out.println("wrong password");
        }
    }
    public void Deposite(double M) {
        this.Saving+=M;
    }
    public void TransferTo(Bank B, double M) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter password");
        String password = x.nextLine();
        if(password==this.password) {
            if (this.Saving >= M) {
                B.Deposite(M);
                this.Withdraw(M);
            } else {
                System.out.println("This account " + ID + " do not have enought money");
            }
        }else{
            System.out.println("wrong password");
        }
    }
}

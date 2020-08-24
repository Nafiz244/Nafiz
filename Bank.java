public class Bank {
    private double savingBalance, currentBalance;
    public Bank(){
        savingBalance = 0;
        currentBalance = 0;
    }
    public void deposite(double amount, String account){
        if(account == "s"){
            savingBalance += amount;
        }else{
            currentBalance += amount;
        }
        printBalance();
    }
    public void withdraw(double amount, String account){
        if(account == "s"){
            if(amount <= savingBalance){
                savingBalance -= amount;
                System.out.println("$"+ amount + " withdrawed from your saving account.");
            }else{
                System.out.println("Insufficient fund!");
            }
        }else{
            if(amount <= currentBalance){
                currentBalance -= amount;
                System.out.println("$"+ amount + " withdrawed from your current account.");
            }else{
                System.out.println("Insufficient fund!");
            }
        }
        this.printBalance();
    }
    public void transfer(double amount, String account){
        if(account == "s"){
            if(amount <= savingBalance){
                savingBalance -= amount;
                currentBalance += amount;
                System.out.println("$"+ amount + " transferred to your current account.");
            }else{
                System.out.println("Insufficient fund!");
            }
        }else{
            if(amount <= currentBalance){
                currentBalance -= amount;
                savingBalance += amount;
                System.out.println("$"+ amount + " transferred to your saving account.");
            }else{
                System.out.println("Insufficient fund!");
            }
        }
        this.printBalance();
    }

    public void printBalance(){
        System.out.println("Your current balance: ");
        System.out.println("\tSaving: $" + savingBalance);
        System.out.println("\tCurrent: $" + currentBalance);
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposite(10000, "s");
        b.deposite(20000, "c");
        b.transfer(1000, "c");
        b.withdraw(500, "c");
    }
}
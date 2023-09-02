public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance()
  {
      System.out.println("\nHello!\nYour balance is " + balance);
  }

  public void deposit(int amountToDeposit)
  {
    System.out.println("You just deposited "+ amountToDeposit);
    balance+=amountToDeposit;
  }

  public int withdraw(int amountToWithdraw)
  {
    balance-=amountToWithdraw;
    System.out.println("You just withdrew "+ amountToWithdraw);
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
  
    //Withdrawing:
    savings.withdraw(300);

    //Deposit:
    savings.deposit(1000);

    //Check balance:
    savings.checkBalance();
    
  }       
}

class InsufficientFund extends Exception {
  InsufficientFund(String message) {
    super(message);
  }
}

class BankAccount {
  private int amount;

  BankAccount(int depositAmount) {
    this.amount = depositAmount;
  }

  void withdraw(int withdrawAmount) throws InsufficientFund {
    if (withdrawAmount <= this.amount) {
      this.amount -= withdrawAmount;
      System.out.println("Withdraw successful.");
    } else {
      throw new InsufficientFund("Insufficient funds!!");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    BankAccount a1 = new BankAccount(5000);

    try {
      a1.withdraw(1000);
      a1.withdraw(5000);
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println("Program ended.");
  }
}
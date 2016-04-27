package scala.test

/**
 * Created by wq on 16-4-6.
 */
class BankAccount(initialBalance :Double) {
  private var balance  =initialBalance

  def deposit(amount:Double)={
    balance += amount
    balance
  }
  def withdraw(amount:Double)={
    balance -= amount
    balance
  }
}

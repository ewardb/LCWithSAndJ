package scala.test

/**
 * Created by wq on 16-4-7.
 */
class SavingsAccount(initialBalance:Double) extends BankAccount(initialBalance :Double) {
  private var num:Int = _

  def earnMonthlyInterest() = {
    num = 3
    super.deposit(1)
  }

  override def deposit(amount:Double) = {
    num -=1
    if(num<0) super.deposit(amount-1) else super.deposit(amount)
  }

  override def withdraw(amount:Double)= {
    num -=1
    if(num<0) super.withdraw(amount+1) else super.withdraw(amount)
  }
}

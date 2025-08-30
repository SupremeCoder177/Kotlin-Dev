fun main(){
    val account1 = Account("Test")
    account1.deposit(1000)
    account1.withdraw(500)
    println("The account name is ${account1.getName()}")
}

class Account(private final val accountName: String){
    private var balance = 0;
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if(amount > 0){
            transactions.add(amount)
            balance += amount
            println("$amount was deposited. Balance is now ${this.balance}")
        }else{
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(amount: Int){
        if(-amount < 0){
            transactions.add(-amount)
            balance += -amount
            println("$amount was withdrawn. Balance is now ${this.balance}")
        }else{
            println("Cannot withdraw negative sums")
        }
    }

    fun getName() = this.accountName
}
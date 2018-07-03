class Account{
    var balance = 0.0

    infix fun add(amount: Double){
        this.balance = balance + amount
    }
}

fun main(args: Array<String>) {
    val account = Account()
    
}
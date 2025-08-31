fun main(){

}

// this is how you inherit from multiple classes
// you first implement an interface then use the 'by' keyword
// to tell the compiler which implementation of the interface you want to add to your class
class App: A by FirstDelegate(), B by SecondDelegate(){}

interface A{
    fun print()
}

interface B{
    fun print2()
}

class FirstDelegate: A{
    override fun print() {
        TODO("Not yet implemented")
    }
}

class SecondDelegate: B{
    override fun print2() {
        TODO("Not yet implemented")
    }
}
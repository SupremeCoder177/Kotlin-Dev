fun main(){
    val obj1 = Something("Hello", 12)
    val obj2 by lazy {
        Something("World", 20)
    }

    // now that we are using the lazy object the initializer block is called
    println(obj2.arg1)
}

class Something(var arg1 : String, var arg2: Int){
    init {
        println("The object was initialized")
    }
}
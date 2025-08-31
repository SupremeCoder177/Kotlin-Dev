fun main() {
    val success = Result.Success("SUCCESS!")
    val error = Result.Error("FAILED!")
    val unknown1 = Result.Unknown
    val unknown2 = Result.Unknown

    // these both point to the same object
    println(unknown1)
    println(unknown2)

    getData(success)
    getData(error)
}

fun getData(result: Result){
    when(result){
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}

// sealed means = all subclasses must be defined in the same file
//                sealed classes are another form of enums classes, the difference being they don't hold singleton objects
//                they act as parent classes for subclasses, but you can declare an object within a sealed class as well
sealed class Result(val message: String){

    // these are subclasses not singleton objects and need to be instantiated
    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)

    object Unknown // now this is a singleton object

    fun showMessage(){
        println("Result : $message")
    }

}
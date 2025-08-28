fun main(){
    val user = User("Alex", "John", 21)
    val friend = User("Michael", "Byron", 22)
    println(user.name)
    println(friend.name)
}


class User(name: String, var lastName: String, var age: Int){
    //doing argument validation
    var name: String

    //this is the constructor,
    //and you can declare more than one initialize blocks
    init {
        if(name.lowercase().startsWith("a")){
            this.name = name
        }else{
            this.name = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }
}

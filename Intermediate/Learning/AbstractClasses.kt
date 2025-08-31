fun main(){
    val dog1 = Dog("Bob", 10)
    val dog2 = Dog("Builder", 11)
    val cat1 = Cat("Tom", 10)

    println(dog1)
    println(cat1)
    println(dog1 == dog2)

    dog1.talk()
    dog1.move()
    cat1.talk()
    cat1.move()
}

// abstract classes are only there for defining the content of the subclasses which inherit it
abstract class Animal{
    abstract fun talk()
    abstract fun move()
}

class Dog(val name: String, var age: Int) : Animal(){
    override fun talk() {
        println("The dog goes, Bark Bark!")
    }

    override fun move() {
        println("The dog is moving.")
    }

    //overriding toString, equals and hashCode functions
    // means you want to implement your own version of those functions
    // other than the one defined in the Any Class
    // all classes inherit from the Any class in Kotlin


    // toString returns the string representation of the object
    override fun toString(): String {
        return "Name = $name, Age = $age"
    }

    //equals is used to determine if two objects are the same
    override fun equals(other: Any?): Boolean {
        return if(this === other) true
        else{
            if(other is Dog){
                this.name == other.name && this.age == other.age
            }else false
        }
    }
}

// data classes generate a new version of the toString, equals and hashcode function
// so basically the same thing in the dog class but more concise
data class Cat(val name: String, var age: Int) : Animal(){
    override fun talk() {
        println("The cat goes, Meow Meow!")
    }

    override fun move() {
        println("The cat is moving.")
    }

}
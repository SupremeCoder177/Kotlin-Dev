fun max(a : Int, b : Int): Int = if(a > b) a else b
fun max(a : Int, b : Int, c : Int): Int = if(a > b && a > c) a else if(b > a && b > c) b else c

fun max(vararg  nums: Int): Int{
    var temp = nums[0]
    nums.forEach { temp = if(it > temp) it else temp }
    return temp
}

fun main(){
    println(max(1, 2))
    println(max(1, 2, 3))
    println(max(1, 2, 3, 199, 122, 34, 54, 5, 24, 234))
}
package ex20221123

fun main() {

    var result: Int
    result = sum3({x,y -> x+y}, 10, 20)
    println(result)

}

fun sum3(sum:(Int, Int)->Int, a:Int, b:Int):Int{
    return sum(a,b)
}
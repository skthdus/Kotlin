package ex20221121

fun main() {

    // 1) 산술 연산자 : +, -, *, /, %

    val num1 = 30
    val num2 = 15

    var result: Int

    result = num1 + num2
    println("+ : $result")

    result = num1 - num2
    println("- : $result")

    result = num1 * num2
    println("* : $result")

    result = num1 / num2 // 0 -> / by zero Exception 발생
    // num2가 0이 아님을 확인하세요!
    println("/ : $result")

    result = num1 % num2 // 0 -> / by zero Exception 발생
    println("% : $result")
}
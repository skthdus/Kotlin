package ex20221118

fun main() {

    // Kotlin에서는 자료형이 서로 다른 변수를 비교하거나 연산할 수 없다.
    // Kotlin에서는 자료형이 서로 다른 변수를 같은 자료형으로 만들어줘야 한다.

    // 형변환 (Cast)
    // 1. 자료형을 확인하는 방법
    // 1-1) println(변수명::class.java.simpleName)
    // 1-2) is : 자료형 체크하는 연산자
    // instanceof랑 같은 역할 : 객체타입을 확인하는 역할

    // 2. 자료형 변환하는 방법
    // 2-1) to자료형 : 기본타입 형변환

    val num = 256
    println(num::class.java.simpleName)

    val str = num.toString()
    println(str::class.java.simpleName)

}
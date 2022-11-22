package ex20221121

fun main() {

    // 3) 증감 연산자 (++, --)
    // num++, num-- : 후치 연산자
    // : 코드가 실행된 후 +1
    // ++num, --num : 전치 연산자
    // : +1이 된 후 코드 실행

    var num = 1

    println(num++) // 1 > println 먼저
    // +1
    println(num) // 2
    println(++num) // 3
    println(num) // 3
    println(num--) // 3
    println(num) // 2
    println(--num) // 1
    println(num) // 1

}
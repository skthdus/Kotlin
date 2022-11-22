package ex20221121

import java.util.*

fun main() {

    // 입력하는 도구를 가져오는 방법
    // Scanner sc = new Scanner(System.in)
    val sc = Scanner(System.`in`)
    // java : .in 콘솔창으로 입력될 무언가가 있다
    // .`in` ---> Run창으로 입력될 무언가가 있다.
    println()

    // readLine() 사용해서 런창에 입력할 수 있다
    println("readLine()을 사용한 입력 >> ")
    var num1 = readLine()?.toInt()
    // readLine은 무조건 String?타입을 리턴

//    println("readLine()을 반드시 입력해야 합니다>> ")
//    var num1 = readLine()!!.toInt()

    // 1. null이 발생할 수 있는 상황에 대해서 조건식 부여
    if (num1 != null) {
        print(num1 + 2)
    }
    
    // 2. Elvis 연산자
    // print(num1?.plus(2) ?: 실행 코드, 데이터 값 )

    // 3.
    // println(num1!! + 2)
    // ? x

}
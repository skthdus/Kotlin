package ex20221123

fun main() {

    // 람다 대수
    // 수학 : 이름이 없는 함수
    //        두 개이상의 수를 1개의 결과값으로 단순화
    // 프로그래밍 : 다른 함수의 인자로 넘기는 함수 (매개변수)
    //              함수의 결과값으로 반환하는 함수 (리턴값)
    //              변수에 저장하는 함수를 의미 ***

    // 매개변수 -> 리턴값
    {x:Int, y:Int -> x+y}
    // 더하기 기능을 필요할 때마다 사용하려면 어딘 가에 저장 : 변수
//    val sum: (Int, Int) -> Int = {x:Int, y:Int -> x+y}

    // 1. 람다식의 매개변수에 자료형이 지정되어 있다면
    // 변수에서 자료형은 생략할 수 있다
    val sum = {x:Int, y:Int -> x+y}
    // 2. 변수의 매개변수 자료형이 지정되어 있다면 람다식의 매개변수
    // 자료형은 생략 가능하다
//    val sum: (Int, Int) -> Int = {x, y-> x+y}

    println(sum(3,4))
    // 단, 람다식과 변수의 자료형을 둘 다 생략해버리면 추론이 불가능

    // hello라는 변수에 아래 함수를 람다식으로 담아주세요
    fun greet():Unit{
        println("Hello Kotlin")
    }
    // val/var 변수명 : (매개변수의 자료형) -> 리턴타입 = 람다식
//     val hello = {x:String, y:String -> x+y}
//    println(hello("Hello ", "Kotlin"))
    val hello: () -> Unit = { println("Hello Kotlin") }

    // 다음은 정사각형의 넓이를 구하는 함수입니다. 람다식으로 바꿔 주세요
    // (square2 변수 선언)
    fun square1(x:Int):Int{
        return  x*x
    }

//    val square2 = {x:Int -> x*x}
//    println(square2(7))
    val square2: (Int) -> Int = {x -> x*x}

}
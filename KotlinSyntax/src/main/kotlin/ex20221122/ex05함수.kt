package ex20221122

fun main() {

    sum(5, 6)
    println(sum(5,6)) // 결과값을 받아오기만 하고
    // 출력하는 기능은 따로 없음

    sumPrint(5,6)
    // void ----> Unit
    // void , unit 같은 경우에는 '기능' 자체를 가지고 있는 함수

} //main 밖

// sumPrint : 매개변수가 2개이고, 리턴타입이 Unit
fun sumPrint(num1:Int, num2:Int):Unit {
    println(num1+num2)
}


fun sum(num1: Int, num2: Int):Int{
    // fun + 함수명(호출명) + ( 매개변수 ) : 리턴타입
    // 단, 리턴타입에 자료형이 명시 되어있으면 return이라는 키워드 필요
    return num1 + num2
}
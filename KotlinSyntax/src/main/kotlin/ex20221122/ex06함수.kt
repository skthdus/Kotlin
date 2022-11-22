package ex20221122

fun main() {
    // 호출 했을 때 내 이름의 결과값만 가지고 오는 함수!
    getName("조자연")
    println(getName("조자연"))

}

//fun getName(name: String): String{
//    return name
//}

// 중괄호 {} 안의 코드가 한 줄이면 중괄호랑 return 키워드를 생략할 수 있다.
// 단, return 키워드 대신 대입연산자 (=) 사용하기
// fun getName(name: String): String = name
// 반환하고 있는 데이터를 보고 리턴타입도 추론이 가능
fun getName(name: String) = name
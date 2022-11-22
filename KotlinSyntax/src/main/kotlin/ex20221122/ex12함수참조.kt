package ex20221122

fun todayWeather(){
    println("오늘 광주 날씨는 맑음")
}
// ::함수이름 ---> 안드로이드 intent
// 함수를 호출해서 변수에 대입이 가능
val weather = ::todayWeather

fun main() {
    // 함수를 참조해서 변수처럼 사용해보자
    // 함수 참조를 통해서 변수처럼 사용하고 싶으면
    // 변수명 뒤에 .call() 을 붙여줘야 한다.
    weather.call()

}
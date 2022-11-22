package ex20221122

fun main() {

    // Java
    // for( int i=0; i<3; i++) {
    //      println(i)
    // }

    // Kotlin
    // for ( i in 0..2) {
    //        println(i)
    // }


    // 1 ~ 10까지 for문을 사용해서 출력해보자
    for(i in 1..10){
        println(i)
    }

    // 1,3,5,7,9를 for문을 사용해서 출력해보자
    for(i in 1..9 step 2) println(i)
    // 실행코드가 한 줄이면 {}(중괄호) 생략 가능

    // ------------------------------------
    // 10 ~ 1 까지 for문을 사용해서 출력해보자
    for(i in 10 downTo  1) println(i)

    // 10,8,6,4,2를 for문을 사용해서 출력해보자
    for(i in 10 downTo 2 step 2) println(i)

}
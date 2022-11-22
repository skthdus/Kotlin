package ex20221121

fun main() {
    
    // 단순 if (만약에 ~하면 ~한다)
    val gender = "여"
    if (gender == "여") println("여자입니다.")
    //val result2 = if(gender == "여") "여자입니다."

    // if(조건문) else
    if (gender == "여") println("여자입니다.") else println("남자입니다.")

    val result = if (gender == "여") "여자입니다." else "남자입니다."
    println(result)


 }

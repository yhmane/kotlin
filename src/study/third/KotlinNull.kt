package study.third

/**
 * null
 * null 허용시 자료형? , 비허용시 자료형으로만 선언
 * safe call ?.
 * non-null 단정 !!.
 * */

fun main() {

    // 1 null 허용/비허용
    var str1: String = "Hello Kotlin"
    // str1 = null  null 할당 불가
    var str2: String? = "Hello Kotlin"
    str2 = null
    println("str1 ${str1} , str2 ${str2}")


    // safe-call
    println("str1 ${str1.length} , str2 ${str2?.length}")   // null 일시 npe 가 발생하지만 safe-call을 쓰게 되면 null 반환
    str2 = "Hello World"
    println("str1 ${str1.length} , str2 ${str2?.length}")


    // non-null
    println("str1 ${str1.length} , str2 ${str2!!.length}")
    str2 = null
    println("str1 ${str1.length} , str2 ${str2!!.length}")  // null일 경우 NPE 강제 발생
}
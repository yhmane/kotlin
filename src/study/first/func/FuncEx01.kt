package study.first.func

/**
 * 코틀린 함수 선언 syntax
 * fun 함수이름(변수이름: 자료형,...): return자료형 {
 *      표현식 ...
 *      return 반환값
 * }
 *
 * 축약시
 * fun 함수이름(변수: 자료형 ...) = 표현식식
 */


/**
 * 코틀린 덧셈 함수
 */
fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum;
}

/**
 * 코틀릿 덧셈 함수 간략화 1
 */
fun sum1(a: Int, b: Int): Int {
    return a + b
}

/**
 * 코틀린 덧셈 함수 간략화 2
 */
fun sum2(a: Int, b: Int): Int = a + b

/**
 * 코틀린 덧셈 함수 간략화 3
 */
fun sum3(a: Int, b: Int) = a + b

fun main() {
    println(sum(1, 3))
    println(sum1(1, 3))
    println(sum2(1, 3))
    println(sum3(1, 3))
}

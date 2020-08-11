package study.first.func

/**
 * 함수형 프로그래밍이란?
 * 순수함수를 작성하여 프로그램의 부작용을 낮추고, 람다식과 고차함수를 사용하는 것
 *
 * 순수 함수
 * fun sun(a: Int, b: Int): Int {
 *      return a + b;
 * }
 *
 * 순수 함수 X
 * fun check() {
 *      val test = User.grade()  // check 함수에 없는 외부의 User 객체를 사용
 *      if ( test != null) process(test)
 * }
 *
 * 람다함수
 * 함수의 이름이 없고 화살표 사용
 *
 * 고차함수
 * 인자나 반환값으로 함수를 사용용
* */

fun funcSum(a: Int, b: Int) = a + b
fun funcMul(a: Int, b: Int) = a * b

fun main() {
    val res1 = funcSum(3, 2)
    val res2 = funcMul(funcSum(3, 3), 3) // 인자에 함수를 이용

    println(res1)
    println(res2)
}
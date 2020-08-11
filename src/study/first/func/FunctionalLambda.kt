package study.first.func

fun main() {

    var multiOriginal: (Int, Int) -> Int = {x: Int, y: Int -> x * y} // 람다의 전체 표현
    val multi = {x: Int, y: Int -> x * y}   // 람다를 변수에 할당
    //val multi = {x, y -> x * y}   // 자료형을 추론할 수 없기 때문에 오류
    println(multiOriginal(3, 3))
    println(multi(3, 4))

    val greetOri: () -> Unit = {println("Hello World")}
    val greet = {println("Hello World")}    // 생략해도 추론이 가능
    greetOri()
    greet()
}
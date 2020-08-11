package study.first.func

/**
 * 매개변수에 기본값을 설정 할 수 있음
 * fun printStr(name: String = "기본값")
 *
 *인자를 여러개 받을 수 있음
 * fun normalVals(vararg counts: Int)
 * */

/**
 * 기본값 200, 300
 */
fun mul(a: Int = 200, b: Int = 300) = a * b

fun normalVals(vararg number:Int): Int {
    var tot = 0

    for (i in number) {
        tot += i
    }

    return tot
}

fun main() {
    println(mul())
    println(normalVals(1, 2, 3, 4, 5))
}


package `03kotlin_function_programing`

fun main() {
    val name = "황윤호"
    val email = "hwang@gmail.com"

    info(name)
    info(name, email)
}

fun info(name: String, email: String = "sample@example.com") {
    println("${name}님의 이메일은 ${email}입니다")
}
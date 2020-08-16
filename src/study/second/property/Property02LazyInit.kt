package study.second.property

/**
 * 지연초기화
 * 객체의 정보가 나중에 나타나틑 경우 지연 초기화를 이용
 * lateinit과 lazy 키워드를 이용
 * lateinit은 var로 선언된 프로퍼티에만 사용 가능 (get/set 사용 불가)
 * */

/**
 * field 지연 초기화
 */
class Person {
    lateinit var name: String // 지연 초기화를 위한 선언

    fun test() {
        if (!::name.isInitialized) {
            println("초기화 전")
        } else {
            println("초기화")
        }
    }
}

/**
 * 객체 지연 초기화화
 * */
data class Student(var name: String, var age: Int)
lateinit var student: Student // 객체 생성의 지연 초기화

fun main() {
    // 필드 지연 초기화`
    val person = Person()
    person.test() // 초기화 전
    person.name = "윤호"
    person.test() // 초기화 후
    println("사람 이름 ${person.name}")

    // 객체 지연 초기화
    student = Student("윤호", 30) // 생성자 호출 시점에 초기화
    println("이름 : ${student.name}, 나이 : ${student.age}")
}
fun main() {
    val input = readLine()!!.split(' ').map(String::toInt)
    val A = input[0]
    val B = input[1]

    if (A > 0 && B > 0 && A < 10 && B < 10) {
        val result = A + B
        println(result)
    } else {
        println("0 < A, B < 10 사이의 정수를 입력하세요.")
    }
}

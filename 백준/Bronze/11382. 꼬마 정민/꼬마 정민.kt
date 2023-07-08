fun main(args: Array<String>) {
    val input = readln()
    val numbers = input.split(" ").map {it.toBigInteger()}
    val sum = numbers[0]+numbers[1]+numbers[2]
    print(sum)
}

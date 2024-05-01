import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val io = FastIO()
    val x = io.nextInt()
    val y = io.nextInt()

    val quadrant = when {
        x > 0 && y > 0 -> "1"
        x < 0 && y > 0 -> "2"
        x < 0 && y < 0 -> "3"
        x > 0 && y < 0 -> "4"
        else -> throw IllegalArgumentException()
    }

    io.println(quadrant)
    io.flush()
    io.close()
}

class FastIO {
    private val reader = BufferedReader(InputStreamReader(System.`in`))
    private val writer = BufferedWriter(OutputStreamWriter(System.out))
    private var tokenizer: StringTokenizer? = null

    fun nextToken(): String {
        while (tokenizer == null || !tokenizer!!.hasMoreTokens()) {
            tokenizer = StringTokenizer(reader.readLine())
        }
        return tokenizer!!.nextToken()
    }

    fun nextInt(): Int = nextToken().toInt()
    fun nextLong(): Long = nextToken().toLong()
    fun nextDouble(): Double = nextToken().toDouble()

    fun nextLine(): String {
        if (tokenizer != null && tokenizer!!.hasMoreTokens()) {
            return tokenizer!!.nextToken("\n")
        } else {
            return reader.readLine()
        }
    }

    fun print(data: String) {
        writer.write(data)
    }

    fun println(data: String) {
        writer.write(data)
        writer.newLine()
    }

    fun flush() {
        writer.flush()
    }

    fun close() {
        reader.close()
        writer.close()
    }
}
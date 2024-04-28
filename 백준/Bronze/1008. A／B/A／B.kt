
fun main(){

    val input = readLine()!!.split(' ').map(String::toDouble)

    val x = input[0]
    val y = input[1]

    if( x>0 && y>0 && x<10 && y<10 ){
        print(x/y)
    }

}
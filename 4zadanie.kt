import kotlin.math.pow

fun main (){
    try {
        var x = readLine()!!.toDouble()

        when {
            (x <= -3) -> println(9)
            (x > -3) -> println("${String.format("%,2f", 1 / (x.pow(2)+1))}")
        }


    }
    catch (e:Exception)
    {
        println("Ошибка.")
    }

}
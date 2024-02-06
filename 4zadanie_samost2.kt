fun main(){
    try {
        var x = readLine()!!.toString()

        if (x.length < 2)
        {
            println("Введено не двухзначное число")
        }

        when {
            (x.contains("27")) -> println("В числе есть и 2 и 7")
            (x.contains('2')) -> println("В числе есть 2")
            (x.contains('7')) -> println("В числе есть 7")
            else -> println("В числе нету цифер 2 или 7")
        }
    }
    catch (e:Exception)
    {
        println("Ошибка")
    }

}
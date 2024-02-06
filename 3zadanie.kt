fun main(){
    try {
        var number1 = readLine()!!.toInt();

        when (number1){
            in 0..2 -> println("Младенец")
            in 2..12 -> println("Ребёнок")
            in 12..18 -> println("Подросток")
            in 18..28 -> println("Молодой человек")
            in 29..49 -> println("Взрослый")
            in 50..99 -> println("Пенсионер")
            else -> println("Старый человек")
        }

    }catch (e:Exception) {
        println("Ошибка.")
    }

}
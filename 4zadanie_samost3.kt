fun main() {
    try {
        var nif_nif = readLine()!!.toInt()
        var nuf_nuf = readLine()!!.toInt()
        var naf_naf = readLine()!!.toInt()

        if (nif_nif < nuf_nuf && nif_nif < naf_naf)
        {
            println("Ниф-ниф обленился")
        }
        else if (nuf_nuf < naf_naf && nuf_nuf < nif_nif)
        {
            println("Нуф-нуф обленился")
        }
        else {
            println("Наф-наф обленился")
        }

    }
    catch (e:Exception)
    {
        println("Ошибка.")
    }



}
fun addTwoDigits(n: Int): Int {
    val a = n.toString().toList()
    var arrInt = a.map{it.toString().toInt()}
    return arrInt.sum()
}
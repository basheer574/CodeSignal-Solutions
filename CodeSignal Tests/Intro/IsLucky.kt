fun isLucky(n: Int): Boolean {
    var ar = n.toString().toList()

    var c1 = ar.map { it.toString().toInt() }
    //Create sublist from the first half of c1.
    var x = c1.subList(0, c1.size / 2)
    //Create another sublist from the other half of c1.
    var w = c1.subList(x.size,c1.size)

    //Sum the two List.
    return x.sum()==w.sum()
}

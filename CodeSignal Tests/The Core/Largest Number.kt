fun largestNumber(n: Int): Int {
    return Math.round((Math.pow(10.0, n.toDouble()) - 1)).toInt()
}
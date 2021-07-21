fun maxMultiple(divisor: Int, bound: Int): Int {
    var a = mutableListOf<Int>()
    
    for(i in 0..bound){
        if(i%divisor==0){
            a.add(i)
        }
    }
    return a.max()!!.toInt()
}
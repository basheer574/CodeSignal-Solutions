fun sortByHeight(a: MutableList<Int>): MutableList<Int> {

    var sortedList = mutableListOf<Int>()
    var x = mutableListOf<Int>()
    var n = 0

    for(i in 0 until a.size){
        if(a[i] >= 0)
        {
            sortedList.add(a[i])
            x = sortedList
            x.sort()
        }
    }
    for(i in 0 until a.size){
        if(a[i] >= 0){
            a[i] = x[n]
            n+=1
        }
    }
    return a
}

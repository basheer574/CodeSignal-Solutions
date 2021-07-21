fun commonCharacterCount(s1: String, s2: String): Int {
    var count = 0

    //Split space between the two strings.
    var a1 = s1.split("").toMutableList()
    var a2 = s2.split("").toMutableList()

    for(i in 0..a1.size-1){
        //get index of current element on a1 thats on a2 index.
        var index = a2.indexOf(a1[i])
        //Check if the index is not equal to -1.
        if(index!=-1)
        {
            //Change the current index with a number.
            a2.set(index,1.toString())
            //Rise the count by one.
            count +=1
        }
    }
    //return the common character count.
    return count-2
}
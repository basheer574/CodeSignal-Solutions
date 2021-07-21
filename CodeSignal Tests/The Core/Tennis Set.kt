fun tennisSet(score1: Int, score2: Int): Boolean {
    //Create two vars to store the minimum and maximum values in.
    val n1:Int = Math.min(score1, score2)
    val n2:Int = Math.max(score1,score2)
    
    if(n2==6)
    return n1<5
    
    return n2==7 && n1>=5 && n1 < n2
}

fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    
    if(s<min1){
        return 0
    }
    for(i in 2..10){
        if(s<min1+min2_10*(i-1)){
            return i-1
        }
    }
    return 10 +(s-min1-min2_10 * 9) / min11;
}

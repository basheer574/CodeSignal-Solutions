fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {

    //Initialize counter for each state.
    var c1:Int = 0
    var c2:Int = 0


    for(i in 0..sequence.size-2){
        if(sequence[i] >= sequence[i+1])
            c1++
    }

    for(j in 0..sequence.size -3){
        if(sequence[j] >= sequence[j+2])
            c2++
    }
    //Check if the sequence is strictly increasing.
    return (c1 <=1) && (c2 <= 1);
}
fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    //Create array to store longest strings in.
    var array = mutableListOf<String>()
    var longLenth:Int = 0


    for(i in 0 until inputArray.size){
        //Check if the current longest length is smaller than the current element of the arry.
        if(longLenth < inputArray[i].length){
            longLenth = inputArray[i].length
        }
    }

    for(j in 0 until inputArray.size){
        //Check if the current elment length is equal to the current longest length.
        if(inputArray[j].length == longLenth){
            //Add the element to the array.
            array.add(inputArray[j])
        }
    }
    return array
}
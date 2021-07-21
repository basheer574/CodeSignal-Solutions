fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {

    var highestPair = inputArray[0] * inputArray[1]

    for (i in 1..inputArray.size -1){
        //Get the maximum pair in the array.
        highestPair = Math.max(highestPair,inputArray[i] * inputArray[i-1])
    }
    return highestPair
}
fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var sum: Int = 0
    //Create a list to store ghost room in.
    var a  = mutableListOf<Int>()

    for(i in 0 until matrix.size){
        for(j in 0 until matrix[i].size){
            //Check if element is 0.
            if(matrix[i][j]==0){
                a.add(j)
            }
            //Check if ghost array current index is empty.
            else if(a.indexOf(j)==-1){
                sum += matrix[i][j]
            }
        }
    }

    return sum
}

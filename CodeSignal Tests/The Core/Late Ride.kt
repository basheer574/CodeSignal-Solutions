fun lateRide(n: Int): Int {

  var h = (n/ 60 %24).toString()
  var m = (n % 60).toString()
  
  var hList = h.toList()
  var mList = m.toList()
  
  var hInt = hList.map{it.toString().toInt()}
  var hSum = hInt.sum()
  
  var mInt = mList.map{it.toString().toInt()}
  var mSum = mInt.sum()
  
  
  return hSum + mSum
}
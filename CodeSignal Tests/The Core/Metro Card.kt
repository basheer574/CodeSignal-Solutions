fun metroCard(lastNumberOfDays: Int): MutableList<Int> {
  if (lastNumberOfDays==30 || lastNumberOfDays==28){
      return mutableListOf<Int>(31)
  }
  return mutableListOf<Int>(28,30,31)
}

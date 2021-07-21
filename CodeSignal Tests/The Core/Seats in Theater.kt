fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int {
  return (nRows - row) * (nCols- col + 1)
}

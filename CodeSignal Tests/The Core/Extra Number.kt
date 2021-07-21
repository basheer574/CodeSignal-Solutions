fun extraNumber(a: Int, b: Int, c: Int): Int {
  if(a==b){
      return c
  }else if(a==c){
      return b
  }else if(b==c){
      return a
  }
  return 0
}

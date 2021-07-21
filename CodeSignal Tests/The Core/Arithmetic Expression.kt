fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {
    var x:Double = a.toDouble()
    var w:Double = b.toDouble()
    
    if(a+b==c)
    return a+b==c
    else if(a-b==c)
    return a-b==c
    else if(a*b==c)
    return a*b==c
    else if(x/w==c.toDouble())
    return true
    else return false
}

fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean {
    
  if(young && beautiful && !loved)
  return true
  else if(loved && (!beautiful || !young))
  return true
  else 
  return false
}

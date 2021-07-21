fun reachNextLevel(experience: Int, threshold: Int, reward: Int): Boolean {
  var x = experience
  //Check if reward is greater than 0.
  if(reward >0){
      x +=reward
  }
  if(threshold <= x)
  return true
  else
  return false
}

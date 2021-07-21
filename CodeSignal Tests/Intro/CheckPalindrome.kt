fun checkPalindrome(inputString: String): Boolean {
    val x = StringBuilder(inputString)
    //Reverse the string.
    val reversed = x.reverse().toString()
    //Check if the reversed string is equal too the original string.
    return inputString.equals(reversed,ignoreCase = true)
}

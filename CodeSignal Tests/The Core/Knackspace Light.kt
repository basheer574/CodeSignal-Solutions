fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    if (weight1 + weight2 <= maxW)
        return value1 + value2
    if (weight1 <= maxW && weight2 <= maxW)
        return Math.max(value1, value2)
    if (weight1 <= maxW)
        return value1
    if (weight2 <= maxW)
        return value2
    return 0
}
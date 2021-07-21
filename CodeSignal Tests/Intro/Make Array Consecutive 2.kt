fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    return (statues.max() !!- statues.min()!! + 1) - statues.size
}

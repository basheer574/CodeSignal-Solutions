fun centuryFromYear(year: Int): Int {

    if (year % 100 == 0)
    {
        return year / 100
    }
    else
        return year /100 + 1
}

@main def removeChar(string : String, pos: Int): String = {
    return string.take(pos) + string.drop(pos+1)
}

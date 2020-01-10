
//High-order function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1

fun main() {
    val waterFilter: (Int) -> Int = {dirty -> dirty/2}
    println(updateDirty(30, waterFilter))
//  :: Operator is used to specify that increaseDirty is a regular function
    println(updateDirty(15, ::increaseDirty))
    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) {dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}


//blueprint
//sealed
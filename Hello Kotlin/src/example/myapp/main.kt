package example.myapp

fun buildAquarium() {
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//    // default height and length
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    // default width
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//    // everything custom
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()
//    // overload Constructor
    val aquarium6 = Aquarium(numberOfFish = 29)
    println("-- - - - - -")
    aquarium6.printSize()
//    aquarium6.volume = 70
//    aquarium6.printSize()
    println("-- - - - - -")

//    Open Variables
//    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
//    aquarium7.printSize()
//
//    val myTower = TowerTank(diameter = 25, height = 40)
//    myTower.printSize()

}

fun makeFish() {
    var shark = Shark()
    println("The Shark is ${shark.color}")
    shark.eat()
    var plecostomus = Plecostomus()
    println("The plecostomus is ${plecostomus.color}")
    plecostomus.eat()
}

fun main() {
    buildAquarium()
//    makeFish()
}
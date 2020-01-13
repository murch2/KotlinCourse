package example.myapp

abstract class AquariumFish() {
    abstract val color: String
}

class Shark(): AquariumFish(), FishAction {
    override val color = "Gray"
    override fun eat() {
        println("Shark: hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("Plecostomus: eat algae")
    }
}

interface FishAction {
    fun eat()
}


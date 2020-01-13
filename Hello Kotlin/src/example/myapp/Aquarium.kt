package example.myapp

import java.lang.Math.PI

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
//  In Case that we need the variable volume to be readable from outside but only tis class could write
//  we declare set as private


//   open means that subclasses can override
    open var volume: Int
        get() = width * height * length / 1000 // 1000 cm^3 = 1 l
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    init {
        print("Aquarium is initializing 1\n")
    }

    init {
        println("Aquarium is initializing 2\n")
    }

    constructor(numberOfFish:Int): this() {
        println("Construtor Filho")
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1l - 1000 cm^3
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")

    }
}

class TowerTank(override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
//      ellipse area pi * r1 * r2
        get() = (width/2 * length/2 * height/1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}

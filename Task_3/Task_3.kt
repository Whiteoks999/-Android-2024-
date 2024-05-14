import kotlin.math.pow
import kotlin.math.PI
fun main() {

}

interface ThreeDimensionalable {
    fun calculateVolume():Double
    fun calculateAreaBase():Double
}

open class Cube(var a:Double):ThreeDimensionalable {

    override fun calculateVolume(): Double {
        return a.pow(3)
    }
    override fun calculateAreaBase(): Double {
        return a.pow(2)
    }
}

class Parallelepiped (a:Double, var b:Double, var c:Double): Cube(a) {

    override fun calculateAreaBase(): Double {
        return b*c
    }

    override fun calculateVolume(): Double {
        return a*b*c
    }
}

open class Sphere(var r:Double):ThreeDimensionalable {
    override fun calculateVolume(): Double {
        return 4/3*PI*r.pow(3)
    }

    override fun calculateAreaBase(): Double {
        return 0.0
    }
}

class Cone(r:Double, var h:Double):Sphere(r) {
    override fun calculateAreaBase(): Double {
        return PI*r.pow(2)
    }

    override fun calculateVolume(): Double {
        return 1/3*PI*r.pow(2)*h
    }
}
1 + 1

val x = 42

x * x

val y = 23
x + y

// 1 / 0 would return error


def houseA(facade: Double, window: Double): Double =
    val door = 2 * 1
    val substractedArea = door + window * 2
    facade - substractedArea

// optionally, we can signal the end of the function
def houseB(facade: Double, window: Double): Double =
    val door = 2 * 1
    val substractedArea = door + window * 2
    facade - substractedArea
end houseB 

// in scala 2...
def houseC(facade: Double, window: Double): Double = {
    val door = 2 * 1
    val substractedArea = door + window * 2
    facade - substractedArea
}   

// scope
// *** method w/o parameters  ***
val tenSquared: Int = 
    val ten = 10
    ten * ten
    // ten only available within the block


def marathonDuration(speed: Double): Double =
    val distance = 42.195
    val duration = distance / speed
    duration * 60


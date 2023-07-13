package cl.individual.ejercicio10

class FoldablePhone (isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {
    var isFolded: Boolean = false

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun unfold() {
        isFolded = true
    }
    fun fold() {
        isFolded = false
    }
}
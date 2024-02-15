import kotlin.random.Random.Default.nextInt

class Pistola(
    municion: Int,
    tipoDeMunicion: String

) :ArmaDeFuego("Pistola", municion, tipoDeMunicion, 1) {

    override var radio: Radio = if (nextInt(1,2) == 1){Radio.Reducido}else{Radio.Corto}

    override var danio:Int = nextInt(1,5)
}
import kotlin.random.Random

class Rifle (
            municion: Int,
            tipoDeMunicion: String ,
) :ArmaDeFuego("Rifle", municion, tipoDeMunicion, 2) {
    override var radio: Radio = if (Random.nextInt(1, 2) == 1){Radio.Corto}else{Radio.Intermedio}

    override var danio:Int = Random.nextInt(5, 10)


}
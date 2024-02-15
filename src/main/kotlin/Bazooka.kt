import kotlin.random.Random

class Bazooka (
               municion: Int,
               tipoDeMunicion: String,

) :ArmaDeFuego("Bazooka", municion, tipoDeMunicion, 3)  {
    override var radio: Radio = if (Random.nextInt(1, 2) == 1){Radio.Intermedio}else{Radio.Enorme}

    override var danio:Int = Random.nextInt(10, 30)

}
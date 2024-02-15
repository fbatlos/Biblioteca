import kotlin.random.Random.Default.nextInt

abstract class ArmaDeFuego(
    private val nombre: String,
    private var municion: Int,
    private val tipoDeMunicion:String,
    private val municionARestar: Int
):Disparable{

    abstract var radio:Radio
    abstract var danio:Int

    companion object{var cantidadMunicionExtra:Int = nextInt(5,15)}

    override fun dispara(): String {
        when {
            municion >= municionARestar -> {
                municion -= municionARestar
                return "Se ha disparado con el nombre : $nombre y le quedan $municion"
            }

            municion < municionARestar -> {
                return if (cantidadMunicionExtra >= municionARestar) {

                    recargar()
                    "Se ha disparado con el nombre : $nombre y le quedan ${--municion} (Se ha recargado)"
                }else  {
                    "No hay suficiente munición para disparar."
                }
            }

            else -> {return  "No hay suficiente munición para disparar."}
        }
    }
    private fun recargar():String{
        when {
            cantidadMunicionExtra >= municionARestar -> {
                cantidadMunicionExtra -= municionARestar*2
                municion += municionARestar*2
                return "Se ha recargado con el nombre : $nombre y tiene $municion"
            }

            cantidadMunicionExtra < municionARestar -> {
                return if (cantidadMunicionExtra == municionARestar) {
                    cantidadMunicionExtra = 0
                    municion +=municionARestar
                    "Se ha recargado con el nombre : $nombre y tiene $municion (Se ha recargado)"
                }else  {
                    "No hay suficiente munición para Recargar."
                }
            }

            else -> {return  "No hay suficiente munición para Recargar."}
        }
    }
    interface noFuego{

    }

    override fun toString(): String {
        return "nombre : $nombre , Munición: $municion , Tipo de Municion: $tipoDeMunicion mm, Daño: $danio , Radio: $radio "
    }

}

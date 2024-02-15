import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

sealed class Usuario() {
    class Estudiante(id:Int,nombre:String,carrera:String):Usuario()

    class Profesor(id:Int,nombre:String,departamento:String):Usuario()

    class Visitante(id:Int,nombre:String):Usuario()


}


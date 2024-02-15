import kotlin.random.Random

fun main() {
    print("Tu id es : ")
    val id = Random.nextInt(99)
    print(id)
    print("\nDime tu nombre : ")
    val nombre = readln()
    val tipoUsuario = crearUsuario(id,nombre)

    print("\nDesea un libro? s/n ")
    val respuesta = readln()
    try {
        if (respuesta.uppercase() == "S") {
            val libroAdevolver = elegirLibro(tipoUsuario)
        }
    }catch (_:NumberFormatException){
        println("No me has dado un numero")
    }
}

fun elijeUsuariodeLibro(option:Usuario , titulo:String , autor:String , año:Int){
    when(option){
        is Usuario.Estudiante -> {
            val libroprestado = Libro(titulo,autor,año)
            println("\nToma el libro : ${libroprestado.Titulo} , devuelvelo cuanto antes.")

        }

        is Usuario.Profesor -> {
            val libroprestado = Libro(titulo,autor,año)
            println("\nToma el libro : ${libroprestado.Titulo} .")
        }

        is Usuario.Visitante -> {
            println("\nNo puedes llevarte un libro por ser visitante.")
        }


    }



}



fun crearUsuario(id:Int,nombre:String): Usuario {
    println("Que tipo de usuario eres?\n(1)Estudiante\n(2)Profesor\n(3)Visitante")
    val tipoUsuario = readln()
    when(tipoUsuario){
        "1" -> {
            print("Si eres estudiante dime tu carrera : ")
            val estudiante1 = Usuario.Estudiante(id,nombre,readln())
            return estudiante1
        }
        "2" -> {
            print("Si eres profesor dime tu departamento : ")
            val profesor1 = Usuario.Profesor(id,nombre,readln())
            return profesor1
        }

        "3" -> {
            val visitante1 = Usuario.Visitante(id, nombre)
            return visitante1
        }
        else -> {
            println("Esa eleccion no existe.")
            return error("No es una opcion")
        }
    }
}

fun elegirLibro(option: Usuario){
    print("Que libro quieres tomar? ")
    val titulo = readln()
    print("Quien es el Autor? ")
    val autor= readln()
    print("De que año es? ")
    val año = readln().toInt()
    return elijeUsuariodeLibro(option , titulo , autor , año)
}
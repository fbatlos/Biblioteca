sealed class Usuario() {
    class Estudiante(id:String,nombre:String,carrera:String):Usuario()

    class Profesor(id:String,nombre:String,departamento:String):Usuario()

    class Visitante(id:String,nombre:String):Usuario()

}


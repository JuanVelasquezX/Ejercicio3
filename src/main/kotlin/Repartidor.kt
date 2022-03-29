class Repartidor : Empleado {

    var zona : String = ""

    constructor()

    constructor(nombre : String, edad : Int,salario : Int, zona : String){
        super.nombre = nombre
        super.edad = edad
        super.salario = salario
        this.zona = zona

    }
    override fun plus(){
        if (this.edad > 25 && this.zona == "3"){
            println(super.nombre+" si obtiene la comision")
        }
        else{
            println(super.nombre+" no obtiene la comision")
        }
    }
}
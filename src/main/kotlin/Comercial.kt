class Comercial : Empleado{

    var comision : Double = 0.0

    constructor()

    constructor(nombre : String, edad : Int, salario : Int, comision : Double){
        super.nombre = nombre
        super.edad = edad
        super.salario = salario
        this.comision = comision
    }

    override fun plus() {
        if (super.edad > 30 && this.PLUS > 200){
            println(super.nombre+" si obtiene la comision")
        }
        else{
            println(super.nombre+" no obtiene la comision")
        }
    }
}
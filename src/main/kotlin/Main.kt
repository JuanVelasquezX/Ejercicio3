fun main(args: Array<String>) {
    val comercial1 = Comercial("Monge",23,500000,400.59)
    val comercial2 = Comercial("Gollo",35,450000,300.39)
    val repartidor1 = Repartidor("Carlos",22,400000,"2")
    val repartidor2 = Repartidor("Brandon",40,350000,"3")

    comercial1.plus()
    comercial2.plus()
    repartidor1.plus()
    repartidor2.plus()

}
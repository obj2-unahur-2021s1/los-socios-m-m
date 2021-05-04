package ar.edu.unahur.obj2.socios

class Cliente(var estadoQueManeja: EstadoDeAnimo, var plataEnBolsillo: Double, var residencia: LugarDondeVive) {
    fun darPropina(valorPedido: Double) = estadoQueManeja.cuantoDejaDePropina(plataEnBolsillo, valorPedido)
    }

abstract class EstadoDeAnimo{
    abstract fun cuantoDejaDePropina(plataEnBolsillo: Double, valorPedido: Double) : Double
}

object estaEnojado : EstadoDeAnimo() {
    override fun cuantoDejaDePropina(plataEnBolsillo: Double, valorPedido: Double) : Double {
        return 0.0
    }
}

// me queda la duda si la plata en el bolsillo es, como mínimo, el valor del pedido...
object estaIndiferente : EstadoDeAnimo() {
    override fun cuantoDejaDePropina(plataEnBolsillo: Double, valorPedido: Double) : Double {
        return plataEnBolsillo
    }
}


/*
object estaFeliz : EstadoDeAnimo(){
    override fun cuantoDejaDePropina() {
        TODO("Not yet implemented")
    }
}


object estaResfriado : EstadoDeAnimo(){
    override fun cuantoDejaDePropina() {
        TODO("Not yet implemented")
    }
}
*/

abstract class LugarDondeVive{
    abstract fun calcularBono()
}
object lasRosas: LugarDondeVive(){
    override fun calcularBono() {
        TODO("Not yet implemented")
    }

}

object lasLauchas : LugarDondeVive(){
    override fun calcularBono() {
        TODO("Not yet implemented")
    }

}

object barrioVerde : LugarDondeVive(){
    override fun calcularBono() {
        TODO("Not yet implemented")
    }

}

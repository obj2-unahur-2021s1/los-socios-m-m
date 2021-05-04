package ar.edu.unahur.obj2.socios

class Cliente(var estadoQueManeja: EstadoDeAnimo, var plataEnBolsillo: Double, var residencia: LugarDondeVive) {
    fun propinaSinTenerEnCuentaLugar(valorPedido: Double) = estadoQueManeja.cuantoDejaDePropina(plataEnBolsillo, valorPedido)

    fun propinaConEfectoDelLugar(valorPedido: Double) = residencia.modificacionDePropinaPorLugar(this.propinaSinTenerEnCuentaLugar(valorPedido))
}

abstract class EstadoDeAnimo{
    abstract fun cuantoDejaDePropina(plataEnBolsillo: Double, valorPedido: Double) : Double
}

object estaEnojado : EstadoDeAnimo() {
    override fun cuantoDejaDePropina(plataEnBolsillo: Double, valorPedido: Double) : Double {
        return 0.0
    }
}

// me queda la duda si la plata en el bolsillo es, como mínimo, el valor del pedido... tiene sentido
object estaIndiferente : EstadoDeAnimo() {
    override fun cuantoDejaDePropina(plataEnBolsillo: Double, valorPedido: Double) : Double {
        return plataEnBolsillo
    }
}

object estaFeliz : EstadoDeAnimo(){
    override fun cuantoDejaDePropina(plataEnBolsillo: Double, valorPedido: Double): Double {
        return valorPedido*1.25
    }

}


object estaResfriado : EstadoDeAnimo(){
    override fun cuantoDejaDePropina(plataEnBolsillo: Double, valorPedido: Double): Double {
        return valorPedido
    }

}


abstract class LugarDondeVive{
    abstract fun modificacionDePropinaPorLugar(propina: Double) : Double
}
object lasRosas: LugarDondeVive(){
    override fun  modificacionDePropinaPorLugar(propina: Double): Double {
        return propina + 50
    }

}

object lasLauchas : LugarDondeVive(){
    override fun modificacionDePropinaPorLugar(propina: Double) : Double {
       return propina/2
    }

}

object barrioVerde : LugarDondeVive(){
    override fun  modificacionDePropinaPorLugar(propina: Double) : Double {
       //no me quedo claro lo de minimo de 200
        return propina + 200    }

}
object lasTorres : LugarDondeVive() {
    override fun  modificacionDePropinaPorLugar(propina: Double) : Double {
        return propina
    }
}

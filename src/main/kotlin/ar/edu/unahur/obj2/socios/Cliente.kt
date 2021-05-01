package ar.edu.unahur.obj2.socios

class Cliente(var estadoQueManeja: EstadoDeAnimo, var plataEnMano: Int, var residencia: LugarDondeVive  ) {
}
abstract class EstadoDeAnimo{
    abstract fun cuantoDejaDePropina()
}
object estaEnojado : EstadoDeAnimo() {
    override fun cuantoDejaDePropina() {
        TODO("Not yet implemented")
    }
}

object estaFeliz : EstadoDeAnimo(){
    override fun cuantoDejaDePropina() {
        TODO("Not yet implemented")
    }
}
object estaIndiferente : EstadoDeAnimo(){
    override fun cuantoDejaDePropina() {
        TODO("Not yet implemented")
    }
}

object estaResfriado : EstadoDeAnimo(){
    override fun cuantoDejaDePropina() {
        TODO("Not yet implemented")
    }
}

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

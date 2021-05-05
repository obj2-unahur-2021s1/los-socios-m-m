package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    it("no entrega propina") {
      val clienteEnojadoDeLasTorres = Cliente(estaEnojado, 25.0, lasTorres)
      clienteEnojadoDeLasTorres.propinaSegunEstadoAnimo(158.0).equals(0)
    }
    it("la propina, por efecto del lugar, deberia ser la mitad del pedido") {
      val clienteResfriadaDeLasLauchas = Cliente(estaResfriado, 50.0, lasLauchas)
      clienteResfriadaDeLasLauchas.propinaSegunZona(1000.0).equals(500)
    }
    it("deja $200 de propina a pesar de estar enojado") {
      val clienteEnojadoDeBarrioVerde = Cliente(estaEnojado, 150.25, barrioVerde)
      clienteEnojadoDeBarrioVerde.propinaSegunZona(1478.25).equals(200)
    }
    it("cliente de barrio Verde deja más de $200") {
      val clienteFelizDeBarrioVerde = Cliente(estaFeliz, 25.99, barrioVerde)
      clienteFelizDeBarrioVerde.propinaSegunZona(1000.0).equals(250)
    }
    it("el lugar las torres no afecta el precio del pedido"){
      lasTorres.modificacionDePropinaPorLugar(500.0).equals(500)
    }
  }
})

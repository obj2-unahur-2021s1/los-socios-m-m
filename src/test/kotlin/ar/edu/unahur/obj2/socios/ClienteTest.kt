package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    it("no entrega propina") {
      val clienteEnojadoDeLasTorres = Cliente(estaEnojado, 25.0, lasTorres)
      clienteEnojadoDeLasTorres.propinaSegunEstadoAnimo(158.0).shouldBe(0)
    }
    it("la propina, por efecto del lugar, deberia ser la mitad del pedido") {
      val clienteResfriadaDeLasLauchas = Cliente(estaResfriado, 50.0, lasLauchas)
      clienteResfriadaDeLasLauchas.propinaSegunZona(1000.0).shouldBe(500)
    }
    it("deja $200 de propina a pesar de estar enojado") {
      val clienteEnojadoDeBarrioVerde = Cliente(estaEnojado, 150.25, barrioVerde)
      clienteEnojadoDeBarrioVerde.propinaSegunZona(1478.25).shouldBe(200.0)
    }
    it("cliente de barrio Verde deja más de $200") {
      val clienteFelizDeBarrioVerde = Cliente(estaFeliz, 25.99, barrioVerde)
      clienteFelizDeBarrioVerde.propinaSegunZona(1000.0).shouldBe(1250.0)
    }
    it("el cliente enojado de las rosas solo le deja 50"){
      val clienteEnojadoDeLasRosas = Cliente(estaEnojado,0.0,lasRosas)
      clienteEnojadoDeLasRosas.propinaSegunZona(500.0).shouldBe(50.0)
    }
    it("el cliente resfriado de las rosas le da 1050"){
      val clienteResfriadoDeLasRosas = Cliente(estaResfriado,60.0,lasRosas)
      clienteResfriadoDeLasRosas.propinaSegunZona(1000.0).shouldBe(1050.0)
    }
    it("el cliente indiferente de las lauchas solo l da 250.0"){
      val clienteIndiferenteDeLasLauchas = Cliente(estaIndiferente,500.0,lasLauchas)
      clienteIndiferenteDeLasLauchas.propinaSegunZona(500.0).shouldBe(250.0)
    }
    it("el lugar las torres no afecta el precio del pedido"){
      lasTorres.modificacionDePropinaPorLugar(500.0).shouldBe(500)
    }
    it("las lauchas hace que te de la mitad de la propina"){
      lasLauchas.modificacionDePropinaPorLugar(500.0).shouldBe(250.0)
    }
    it("barrio verde te da un minimo de 200 si la propina es menor a 200"){
      barrioVerde.modificacionDePropinaPorLugar(90.0).shouldBe(200.0)
    }
    it("las rosas te da 50 mas por la propina") {
      lasRosas.modificacionDePropinaPorLugar(50.0).shouldBe(100.0)
    }
    it("el estado enojado devuelve 0.0"){
      estaEnojado.cuantoDejaDePropina(50.0,200.0).shouldBe(0.0)
    }
    it("el estado feliz devuelve el valor del pedido por 1.25"){
      estaFeliz.cuantoDejaDePropina(300.0,250.0).shouldBe(312.5)
    }
    it("el estado indiferente devuelve la plata que tiene en el bolsillo"){
      estaIndiferente.cuantoDejaDePropina(250.0,500.0).shouldBe(250.0)
    }
    it("el estado resfriado devuelve el valor del pedido"){
      estaResfriado.cuantoDejaDePropina(90.0,200.0).shouldBe(200.0)
    }
  }
})

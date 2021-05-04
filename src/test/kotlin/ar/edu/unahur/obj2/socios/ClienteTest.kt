package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val clienteEnojadoDeLasTorres = Cliente(estaEnojado, 25.0, lasTorres)
    val clienteResfriadaDeLasLauchas = Cliente(estaResfriado, 50.0, lasLauchas)
    it("no entrega propina") {
      clienteEnojadoDeLasTorres.propinaSinTenerEnCuentaLugar(158.0).equals(0)
    }

    it("la propina, por efecto del lugar, deberia ser la mitad del pedido") {
      clienteResfriadaDeLasLauchas.propinaConEfectoDelLugar(1000.0).equals(500)

    }
    it("el lugar las torres no afecta el precio del pedido"){
      lasTorres.modificacionDePropinaPorLugar(500.0).equals(500)
    }
  }
})

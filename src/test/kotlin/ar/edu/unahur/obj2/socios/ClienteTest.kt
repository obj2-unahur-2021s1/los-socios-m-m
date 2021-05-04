package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val clienteEnojadoDeLasRosas = Cliente(estaEnojado,25.0, lasRosas)

    it("no entrega propina") {
      clienteEnojadoDeLasRosas.darPropina(158.0).equals(0)
    }
  }
})

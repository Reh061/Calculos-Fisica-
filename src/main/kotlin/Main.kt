fun main(args: Array<String>) {

    val fisica = Fisica()

    val forcaPeso = fisica.calcularForcaPeso(200f,9.8f)

    val forcaCentripeta = fisica.calcularForcaCentripeta(135f,34f,12f)

    val impulso = fisica.calcularImpulso(150f,21f,20f)

    val forcaElastica = fisica.calcularForcaElastica(120f,10f)

    val velocidadeMedia = fisica.calcularvelocidadeMedia(180f,50f,171f,40f)

    val movimentoRetilíneoUniformemente = fisica.movimentoRetilineoUniformemente(170f,35f,185f,15f)

    val movimentoRetilineoUniformementeVariado = fisica.movimentoRetilineoUniformementeVariado(160f,22f,40f,60f)

    println("O resultado da força peso é $forcaPeso")
    println("O resultado da força centrípetra é $forcaCentripeta")
    println("O resultado do impulso é $impulso")
    println("O resultado da força elástica é $forcaElastica")
    println("O resultado da velocidade média é $velocidadeMedia")
    println("O resultado do movimento retilíneo uniformemente é $movimentoRetilíneoUniformemente")
    println("O resultado do movimento retilíneo uniformemente variado é $movimentoRetilineoUniformementeVariado")
}
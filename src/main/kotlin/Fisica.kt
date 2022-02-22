class Fisica {
    fun calcularForcaPeso(massa: Float, gravidade: Float) = massa * gravidade

    fun calcularForcaCentripeta(massa: Float, velocidade: Float, raio: Float) = massa * velocidade * raio

    fun calcularImpulso(forca: Float, tempoFinal: Float, tempoInicial: Float) = forca * (tempoFinal - tempoInicial)

    fun calcularForcaElastica(constante: Float, deformacao: Float) = constante * deformacao

    fun calcularvelocidadeMedia(posicaoFinal: Float, posicaoInicial: Float, tempoFinal: Float, tempoInicial: Float) =
        (posicaoFinal - posicaoInicial) / (tempoFinal - tempoInicial)

    fun movimentoRetilineoUniformemente(
        posicaoInicial: Float,
        velocidade: Float,
        tempoFinal: Float,
        tempoInicial: Float
    ) = posicaoInicial + velocidade * (tempoFinal - tempoInicial)

    fun movimentoRetilineoUniformementeVariado(
        posicaoInicial: Float,
        velocidade: Float,
        tempo: Float,
        aceleracao: Float
    ) = posicaoInicial + velocidade * tempo + ((tempo * tempo) * aceleracao / 2)
}
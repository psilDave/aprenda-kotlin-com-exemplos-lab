package testes

import modelos.ConteudoEducacional
import modelos.Formacao
import modelos.Nivel

class criandoConteudosEFormacoes {

    fun main(temasDeConteudosEducacionaisEoTempo: Map<String, Int>, nomeDaFormacao: String, nivelDaFormacao: Nivel) {
        // Definindo a formação:

        val formacao = Formacao(
            nome = nomeDaFormacao,
            conteudos = mutableListOf(),
            alunosAnteriores = listOf(),
            alunosAtuais = mutableListOf(),
            nivel = nivelDaFormacao
        )

        // Adicionando esses temas a formação:

        for (tema in temasDeConteudosEducacionaisEoTempo) {
            formacao.conteudos.add(
                ConteudoEducacional(nome = tema.key, duracao = tema.value)
            )
        }

        // Descrevendo o nome da formação e os conteúdos presentes:

        println("${formacao.nome}: Nível: ${formacao.nivel}")

        for (conteudo in formacao.conteudos) {
            println("${conteudo.nome} : ${conteudo.duracao} min")
        }

    }
}
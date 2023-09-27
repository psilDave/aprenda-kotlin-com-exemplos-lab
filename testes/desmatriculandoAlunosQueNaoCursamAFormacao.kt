package testes

import modelos.Aluno
import modelos.ConteudoEducacional
import modelos.Formacao
import modelos.Nivel

class desmatriculandoAlunosQueNaoCursamAFormacao {
    fun main(
        temasDeConteudosEducacionaisEoTempo: Map<String, Int>,
        nomeDaFormacao: String,
        nivelDaFormacao: Nivel,
        vararg alunosNovos: Aluno,

        ) {

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
        // Desmatriculando novos alunos:

        for (aluno in alunosNovos) {
            formacao.desmatricular(aluno)
        }

        // Imprimindo novos alunos que ainda estão matriculados:

        for (alunoMatriculado in formacao.alunosAtuais){
            println("${alunoMatriculado.name}: ${alunoMatriculado.email}")
        }
    }
}
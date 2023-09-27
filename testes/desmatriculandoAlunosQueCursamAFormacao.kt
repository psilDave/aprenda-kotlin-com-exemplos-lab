package testes

import modelos.Aluno
import modelos.ConteudoEducacional
import modelos.Formacao
import modelos.Nivel
import kotlin.random.Random

class desmatriculandoAlunosQueCursamAFormacao {

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
        // Matriculando novos alunos:

        for (aluno in alunosNovos) {
            formacao.matricular(aluno)
        }

        // Desmatriculando um aluno aleatório:

        formacao.desmatricular(alunosNovos.random())


        // Imprimindo novos alunos que ainda estão matriculados:

        for (alunoMatriculado in formacao.alunosAtuais){
            println("${alunoMatriculado.name}: ${alunoMatriculado.email}")
        }
    }
}
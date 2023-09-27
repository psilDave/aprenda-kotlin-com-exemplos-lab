package modelos

import exceptions.AlunoJaMatriculadoException
import exceptions.AlunoNaoMatriculadoException

/**
data class Formacao  para representar um objeto de dados Formação da DIO, que contem varios conteudos educacionais nele.

@property nome: nome do conteúdo educacional.
@property conteudos: Lista mutável de conteúdos educacionais presentes na Formação.
@property alunosAnteriores: Lista dos Alunos que já cursaram essa Formação.
@property alunosAtuais: Lista mutável de alunos que estão cursando a Formação.
@property nivel: Nivel de dificuldade da formação.

 */
data class Formacao(
    val nome: String,
    val conteudos: MutableList<ConteudoEducacional>,
    val alunosAnteriores: List<Aluno>,
    val alunosAtuais: MutableList<Aluno>,
    val nivel: Nivel
) {

    fun desmatricular(aluno: Aluno) {
        if (alunosAtuais.any { it.id == aluno.id }){
            alunosAtuais.remove(aluno)
        }
        else{
            throw AlunoNaoMatriculadoException()
        }
    }

    @Throws(AlunoJaMatriculadoException::class)
    fun matricular(aluno: Aluno) {
        if (!jaCursouEssaFormacao(aluno)) {
            alunosAtuais.add(aluno)
        } else {
            throw AlunoJaMatriculadoException()
        }
    }

    private fun jaCursouEssaFormacao(aluno: Aluno): Boolean {
        return alunosAnteriores.any { it.id == aluno.id }
    }


}
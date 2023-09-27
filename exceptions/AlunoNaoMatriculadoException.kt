package exceptions

class AlunoNaoMatriculadoException: Exception() {
    override val message: String
        get() = "Aluno não está matriculado, por isso não pode ser removido"
}
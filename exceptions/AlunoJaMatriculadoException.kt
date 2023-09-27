package exceptions

class AlunoJaMatriculadoException: Exception() {
    override val message: String?
        get() = "Aluno já cursou essa formação"
}
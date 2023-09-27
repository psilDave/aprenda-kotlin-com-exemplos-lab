package modelos
/**
class Usuario para representar um objeto Usuario da DIO. Ele é a classe mãe de Aluno, pois podem existir outros usuários
da plataforma DIO que não são alunos, mas instrutores e etc.

@property id: identificação unica para o Aluno.
@property nome: nome do Aluno.
@property senha: senha do Aluno.
@property email: email do Aluno.
 */
open class Usuario(val id: Int, val name: String, var senha: String, var email: String)
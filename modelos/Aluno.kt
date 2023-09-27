package modelos

/**
class Aluno  para representar um objeto Aluno da DIO.

 @property id: identificação unica para o Aluno.
 @property nome: nome do Aluno.
 @property senha: senha do Aluno.
 @property email: email do Aluno.
*/
class Aluno(id: Int, nome: String, senha: String, email: String) : Usuario(id, nome, senha, email) {

}
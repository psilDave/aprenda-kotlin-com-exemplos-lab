package modelos

/**
data class ConteudoEducacional  para representar um objeto de dados conteúdo educacional da DIO.

@property nome: nome do conteúdo educacional.
@property duracao: tempo em minutos do conteúdo educacional, que possuí valor default de 60 min, caso nenhum valor seja
 fornecido.

 */
data class ConteudoEducacional(val nome: String, val duracao: Int = 60)
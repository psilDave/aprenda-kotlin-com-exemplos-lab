import modelos.Aluno
import modelos.Nivel
import testes.*
import java.util.Scanner

fun main() {

    val temas = mapOf("Núcleo do Android " to 80, "Interface de Usuário" to 120,
        "Gerenciamento de Dados" to 45, "Depuração" to 30, "Teste" to 180 )

    val nome = "Certificação Android Associado"
    val alunosAnteriores = listOf<Aluno>(Aluno(1,"Alan", senha ="1234","alan@gmail.com"),
        Aluno(2,"Beto", senha ="5678","beto@gmail.com"),
        Aluno(3,"Carlos", senha ="9101","carlos@gmail.com"),
        Aluno(4,"Davi", senha ="9876","davi@gmail.com"))


    val nivel = Nivel.DIFICIL
    var comando: String = ""

    while (comando.lowercase() != "sair"){
        println("\n Escolha o numero do teste que gostaria de executar: " +
                "\n '1' - Criando Conteúdos e Formações" +
                "\n '2' - Matriculando Alunos Novos Que Não Cursaram A Formação" +
                "\n '3' - Matriculando Alunos Novos Que Cursaram A Formação (lança excessão, melhor executar por ultimo) " +
                "\n '4' - Desmatriculando Alunos Que Cursam A Formação " +
                "\n '5' - Desmatriculando Alunos Que Não Cursam A Formação (lança excessão, melhor executar por ultimo) " +
                "\n 'Sair -  Finalizar o teste.'")

        comando = Scanner(System.`in`).nextLine()

        when (comando.lowercase()) {
            "1" ->  {
                val teste_1 = criandoConteudosEFormacoes()
                teste_1.main(temasDeConteudosEducacionaisEoTempo = temas, nomeDaFormacao = nome,
                    nivelDaFormacao = nivel)
            }


            "2" -> {
                val teste_2 = matriculandoAlunosNovosQueNaoCursaramAFormacao()
                teste_2.main(temasDeConteudosEducacionaisEoTempo = temas,
                    nomeDaFormacao = nome, nivelDaFormacao = nivel,
                Aluno(5,"Eliabe", senha ="6599","eliabe@gmail.com"),
                Aluno(6,"Felipe", senha ="3456","felipe@gmail.com"),
                Aluno(7,"Igor", senha ="4654","igor@gmail.com"),
                Aluno(4,"Davi", senha ="9876","davi@gmail.com"))}

            "3" ->{
                val teste_3 = matriculandoAlunosNovosQueCursaramAFormacao()
                teste_3.main(
                    temasDeConteudosEducacionaisEoTempo = temas,
                    nomeDaFormacao = nome, nivelDaFormacao = nivel, alunosAnteriores = alunosAnteriores,
                    Aluno(5,"Eliabe", senha ="6599","eliabe@gmail.com"),
                    Aluno(6,"Felipe", senha ="3456","felipe@gmail.com"),
                    Aluno(7,"Igor", senha ="4654","igor@gmail.com"),
                    Aluno(4,"Davi", senha ="9876","davi@gmail.com"))
            }

            "4" -> desmatriculandoAlunosQueCursamAFormacao().main(temasDeConteudosEducacionaisEoTempo = temas,
                nomeDaFormacao = nome, nivelDaFormacao = nivel,
                Aluno(5,"Eliabe", senha ="6599","eliabe@gmail.com"),
                Aluno(6,"Felipe", senha ="3456","felipe@gmail.com"),
                Aluno(7,"Igor", senha ="4654","igor@gmail.com"),
                Aluno(4,"Davi", senha ="9876","davi@gmail.com") )

            "5" -> desmatriculandoAlunosQueNaoCursamAFormacao().main(temasDeConteudosEducacionaisEoTempo = temas,
                nomeDaFormacao = nome, nivelDaFormacao = nivel, Aluno(5,"Eliabe", senha ="6599","eliabe@gmail.com"),
                Aluno(6,"Felipe", senha ="3456","felipe@gmail.com"),
                Aluno(7,"Igor", senha ="4654","igor@gmail.com"),
                Aluno(4,"Davi", senha ="9876","davi@gmail.com"))
            "sair" -> {
                println("Finalizando o teste...")
            }
        }


    }

}

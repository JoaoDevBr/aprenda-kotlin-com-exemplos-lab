enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }

    fun exibirConteudos() {
        println("Conteúdos da formação $nome:")
        conteudos.forEach { println("${it.nome} - Duração: ${it.duracao} minutos") }
    }
}

fun main() {
    // Criando alguns objetos para simular cenários de teste
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("Ana")
    val usuario4 = Usuario("Liz")

    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Controle", 120)
    val conteudo3 = ConteudoEducacional("Introdução e prática HTML-CSS", 90)
    val conteudo4 = ConteudoEducacional("Aplicações de JavaScript", 120)

    val formacao = Formacao("Desenvolvimento Web", listOf(conteudo1, conteudo2, conteudo3, conteudo4))

    // Matriculando usuários e exibindo conteúdos
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
    formacao.matricular(usuario4)
    formacao.exibirConteudos()
}

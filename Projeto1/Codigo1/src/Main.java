//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", "Fantasia");
        livro1.obterDadosLivro();

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Central", "Rua da Biblioteca, 123", "(11) 1234-5678", "bibcentral@gmail.com");
        biblioteca1.obterDadosBiblioteca();

        Usuario usuario1 = new Usuario("Fulano", "(11) 1234-5678", "fulano@hotmail.com", "319731", "Jose Alvez da Cunha", "Aluno");
        usuario1.obterDadosUsario();

        Emprestimo emprestimo1 = new Emprestimo( livro1.titulo, usuario1.nome, "01/01/2021", "15/01/2021");
        emprestimo1.obterDadosEmprestimo();

        Funcionario funcionario1 = new Funcionario("João", "(11) 9876-5432", "joao@gmail.com");
        funcionario1.obterDadosFuncionario();

    }
}
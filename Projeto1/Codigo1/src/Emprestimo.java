public class Emprestimo {
    String dataRetirada, dataDevolucao, livro, usuario;

    public Emprestimo(String parametroLivro, String parametroLivroUsuario, String parametroLivroDataRetirada, String parametroLivroDataDevolucao) {
        livro = parametroLivro;
        usuario = parametroLivroUsuario;
        dataRetirada = parametroLivroDataRetirada;
        dataDevolucao = parametroLivroDataDevolucao;
    }

    public Emprestimo() {

    }

    public void obterDadosEmprestimo() {
        System.out.println("---------------------------------------------");
        System.out.println("Empréstimo");
        System.out.print("Livro: " + livro);
        System.out.print(" Usuário: " + usuario);
        System.out.print(" Data de Retirada: " + dataRetirada);
        System.out.println(" Data de Devolução: " + dataDevolucao);
    }
}
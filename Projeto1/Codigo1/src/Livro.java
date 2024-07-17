public class Livro {
    String titulo, autor, editora, categoria;

    public Livro(String parametroTitulo, String parametroAutor, String parametroEditora, String parametroCategoria){
        titulo = parametroTitulo;
        autor = parametroAutor;
        editora = parametroEditora;
        categoria = parametroCategoria;
    }

    public  Livro(){
        titulo = "O Senhor dos Anéis";
    }

    public void obterDadosLivro(){
        System.out.println("---------------------------------------------");
        System.out.println("Livro");
        System.out.print("Titulo: " + titulo);
        System.out.print(" Autor: " + autor);
        System.out.print(" Editora: " + editora);
        System.out.println(" Categoria: " + categoria);
    }
}

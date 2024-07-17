public class Produto {
    String nome, descricao;
    int estoque;
    float preco;

    public Produto(String parametroNome, String parametroDescricao, int parametroEstoque, float parametroPreco){
        nome = parametroNome;
        descricao = parametroDescricao;
        estoque = parametroEstoque;
        preco = parametroPreco;
    }

    public Produto(){

    }

    public void obterDadosProduto(){
        System.out.println("------------------------------------------------");
        System.out.println("Produto");
        System.out.print("Nome: " + nome);
        System.out.print(" Descrição: " + descricao);
        System.out.print(" Estoque: " + estoque);
        System.out.println(" Preço: " + preco);
    }
}

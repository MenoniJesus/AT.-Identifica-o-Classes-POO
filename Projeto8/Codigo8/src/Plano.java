public class Plano {
    String nome, descricao;
    float preco;

    public Plano(String parametroNome, String parametroDescricao, float parametroPreco){
        nome = parametroNome;
        descricao = parametroDescricao;
        preco = parametroPreco;
    }

    public Plano(){

    }

    public void obterDadosPlano(){
        System.out.println("-----------------------------------------------");
        System.out.println("Dados do Plano");
        System.out.print("Nome: " + nome);
        System.out.print(" Descrição: " + descricao);
        System.out.println(" Preço: " + preco);
    }
}
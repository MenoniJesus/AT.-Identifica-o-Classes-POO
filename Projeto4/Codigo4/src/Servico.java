public class Servico {
    String tipo, descricao;
    float preco;

    public Servico(String parametroTipo, String parametroDescricao, float parametroPreco){
        tipo = parametroTipo;
        descricao = parametroDescricao;
        preco = parametroPreco;
    }

    public Servico(){

    }

    public void obterDadosServico(){
        System.out.println("------------------------------------------");
        System.out.println("Dados do Servico");
        System.out.print("Tipo: " + tipo);
        System.out.print(" Descricao: " + descricao);
        System.out.println(" Preco: " + preco);
    }
}
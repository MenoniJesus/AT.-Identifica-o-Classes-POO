public class Quarto {
    String numero, tipo, status;
    float preco;

    public Quarto(String parametroNumero, String parametroTipo, String parametroStatus, float parametroPreco){
        numero = parametroNumero;
        tipo = parametroTipo;
        status = parametroStatus;
        preco = parametroPreco;
    }

    public Quarto(){

    }

    public void obterDadosQuarto(){
        System.out.println("------------------------------------------");
        System.out.println("Dados do Quarto");
        System.out.print("Numero: " + numero);
        System.out.print(" Tipo: " + tipo);
        System.out.print(" Status: " + status);
        System.out.println(" Preco: " + preco);
    }
}
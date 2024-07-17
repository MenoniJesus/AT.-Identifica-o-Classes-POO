public class Pagamento {
    String data, membro, plano;
    float valor;

    public Pagamento(String parametroData, String parametroMembro, float parametroValor, String parametroPlano){
        data = parametroData;
        membro = parametroMembro;
        valor = parametroValor;
        plano = parametroPlano;
    }

    public Pagamento(){

    }

    public void obterDadosPagamento(){
        System.out.println("-----------------------------------------------");
        System.out.println("Dados do Pagamento");
        System.out.print("Data: " + data);
        System.out.print(" Membro: " + membro);
        System.out.print(" Valor: " + valor);
        System.out.println(" Plano: " + plano);
    }
}
public class Envio {
    String status, dataEnvio, dataEntrega;
    Pedido pedido;

    public Envio(String parametroStatus, String parametroDataEnvio, String parametroDataEntrega, Pedido parametroPedido){
        status = parametroStatus;
        dataEnvio = parametroDataEnvio;
        dataEntrega = parametroDataEntrega;
        pedido = parametroPedido;
    }

    public Envio(){

    }

    public void obterDadosEnvio(){
        System.out.println("------------------------------------------------");
        System.out.println("Envio");
        System.out.print("Status: " + status);
        System.out.print(" Data de Envio: " + dataEnvio);
        System.out.println(" Data de Entrega: " + dataEntrega);
    }
}
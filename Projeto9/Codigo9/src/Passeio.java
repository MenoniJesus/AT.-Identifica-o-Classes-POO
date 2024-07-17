public class Passeio {
    String destino, data, guia;

    public Passeio(String parametroDestino, String parametroData, String parametroGuia){
        destino = parametroDestino;
        data = parametroData;
        guia = parametroGuia;
    }

    public Passeio(){

    }

    public void obterDadosPasseio(){
        System.out.println("-----------------------------------------------");
        System.out.println("Passeio");
        System.out.print("Destino: " + destino);
        System.out.print(" Data: " + data);
        System.out.println(" Guia: " + guia);
    }
}
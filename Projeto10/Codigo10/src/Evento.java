public class Evento {
    String tipo, data, localizacao;

    public Evento(String parametroTipo, String parametroData, String parametroLocalizacao) {
        tipo = parametroTipo;
        data = parametroData;
        localizacao = parametroLocalizacao;
    }

    public Evento(){
        tipo = "Adoção";
        data = "01/01/2021";
        localizacao = "Rua";
    }

    public void obterDadosEvento(){
        System.out.println("-----------------------------------------------");
        System.out.println("Evento");
        System.out.print("Tipo: " + tipo);
        System.out.print(" Data: " + data);
        System.out.println(" Localização: " + localizacao);
    }
}
public class Documento {
    String tipo, descricao, data;

    public Documento(String parametroTipo, String parametroDescricao, String parametroData) {
        tipo = parametroTipo;
        descricao = parametroDescricao;
        data = parametroData;
    }

    public Documento(){

    }

    public void obterDadosDocumento(){
        System.out.println("------------------------------------------");
        System.out.println("Documento");
        System.out.print("Tipo: " + tipo);
        System.out.print(" Descrição: " + descricao);
        System.out.println(" Data: " + data);
    }
}

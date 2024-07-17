public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "123.456.789-00", "Rua A, 123", "(11) 99999-9999", "joao@hotmail.com");
        cliente1.obterDadosCliente();

        Advogado advogado1 = new Advogado("Maria", "OAB-12345", "12345", "(44) 99968-8956", "mariazinha32@gmail.com");
        advogado1.obterDadosAdvogado();

        Documento documento1 = new Documento("Contrato", "01/01/2021", "Contrato de Prestação de Serviços");
        documento1.obterDadosDocumento();

        Processo processo1 = new Processo("123456", "Em andamento", "Processo de Divorcio", advogado1, cliente1);
        processo1.obterDadosProcesso();

        Compromisso compromisso1 = new Compromisso("Reunião", "01/01/2021", cliente1, advogado1);
        compromisso1.obterDadosCompromisso();
    }
}

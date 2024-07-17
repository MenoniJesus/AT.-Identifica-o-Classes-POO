public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João", "123.456.789-00", "11 99999-9999", "joao@gmail.com", "Rua 1, 123");
        cliente1.obterDadosCliente();

        Voo voo1 = new Voo("123", new CompanhiaAerea() , "São Paulo", "Rio de Janeiro", "08:00", "09:00", 200);
        voo1.obterDadosVoo();

        CompanhiaAerea companhiaAerea1 = new CompanhiaAerea("GOL", "123", "11 99999-9999", "gol@hotmail.com");
        companhiaAerea1.obterDadosCompanhiaArea();

        Reserva reserva1 = new Reserva(new Cliente(), new Voo(), new Assento(), "01/01/2021");
        reserva1.obterDadosReserva();

        Assento assento1 = new Assento("A1", "Primeira Classe", true);
        assento1.obterDadosAssento();

        }
    }

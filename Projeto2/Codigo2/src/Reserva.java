public class Reserva {
    String dataReserva;
    Cliente cliente;
    Voo voo;
    Assento assento;

    public Reserva(Cliente parametroCliente, Voo parametroVoo, Assento parametroAssento, String parametroDataReserva) {
        cliente = parametroCliente;
        voo = parametroVoo;
        assento = parametroAssento;
        dataReserva = parametroDataReserva;
    }

    public Reserva(){

    }

    public void obterDadosReserva() {
        System.out.println("---------------------------------------------------");
        System.out.println("Reserva");
        System.out.print("Cliente: " + cliente);
        System.out.print(" Voo: " + voo);
        System.out.print(" Assento: " + assento);
        System.out.println(" Data da Reserva: " + dataReserva);
    }
}
public class Reserva {
    String dataReserva, turista, acomodacao, passeio;

    public Reserva(String parametroDataReserva, String parametroTurista, String parametroAcomodacao, String parametroPasseio){
        dataReserva = parametroDataReserva;
        turista = parametroTurista;
        acomodacao = parametroAcomodacao;
        passeio = parametroPasseio;
    }

    public Reserva(){

    }

    public void obterDadosReserva(){
        System.out.println("-----------------------------------------------");
        System.out.println("Reserva");
        System.out.print("Data da Reserva: " + dataReserva);
        System.out.print(" Turista: " + turista);
        System.out.print(" Acomodação: " + acomodacao);
        System.out.println(" Passeio: " + passeio);
    }
}
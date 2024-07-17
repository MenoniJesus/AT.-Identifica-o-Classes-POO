public class Reserva {
    String dataCheckIn, dataCheckOut;
    Hospede hospede;
    Quarto quarto;

    public Reserva(String parametroDataCheckIn, String parametroDataCheckOut, Hospede parametroHospede, Quarto parametroQuarto){
        dataCheckIn = parametroDataCheckIn;
        dataCheckOut = parametroDataCheckOut;
        hospede = parametroHospede;
        quarto = parametroQuarto;
    }

    public Reserva(){

    }

    public void obterDadosReserva(){
        System.out.println("------------------------------------------");
        System.out.println("Dados da Reserva");
        System.out.print("Data de Check-In: " + dataCheckIn);
        System.out.print(" Data de Check-Out: " + dataCheckOut);
        System.out.print(" Hospede: " + hospede);
        System.out.println(" Quarto: " + quarto);
    }
}

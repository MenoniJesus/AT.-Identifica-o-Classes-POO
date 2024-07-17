//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Turista turista1 = new Turista("João", "Marciano", "Marte", "12/09/2074", "30 dias");
        turista1.obterDadosTurista();

        Acomodacao acomodacao1 = new Acomodacao("Hotel", "Marte", 1000, true);
        acomodacao1.obterDadosAcomodacao();

        Guia guia1 = new Guia("José", "Marciano", "Marte");
        guia1.obterDadosGuia();

        Passeio passeio1 = new Passeio("Marte", "12/09/2074", guia1.nome);
        passeio1.obterDadosPasseio();

        Reserva reserva1 = new Reserva("12/08/2074", turista1.nome, acomodacao1.tipo, passeio1.destino);
        reserva1.obterDadosReserva();

    }
}
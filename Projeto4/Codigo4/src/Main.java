//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao", "123456789-00", "Gerente", "9999-9999", "joao@gmail.com");
        funcionario.obterDadosFuncionario();

        Hospede hospede = new Hospede("Maria", "987654321-00", "Rua 1", "8888-8888", "maria@hotmail.com");
        hospede.obterDadosHospede();

        Quarto quarto = new Quarto("200", "Casal","Livre",  250);
        quarto.obterDadosQuarto();

        Reserva reserva = new Reserva("01/01/2021", "10/01/2021",  new Hospede(), new Quarto() );
        reserva.obterDadosReserva();

        Servico servico = new Servico("Cafe da Manha","Uma variedade de opções de comida, desde salgadas a doces, você vai adorar!!!", 50);
        servico.obterDadosServico();
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Membro membro1 = new Membro("João", "123.456.789-00", "Rua 1", "1234-5678", "joao@gmail.com");
        membro1.obterDadosMembro();

        Instrutor instrutor1 = new Instrutor("Maria", "987.654.321-00", "Musculação", "8765-4321", "mariazinha32@gmail.com");
        instrutor1.obterDadosInstrutor();

        Plano plano1 = new Plano("Musculação", "Treino de Musculação", 100);
        plano1.obterDadosPlano();

        Pagamento pagamento1 = new Pagamento("01/01/2021", membro1.nome, 100, plano1.nome);
        pagamento1.obterDadosPagamento();

        Aula aula1 = new Aula("01/01/2021", "08:00", "Musculação", instrutor1.nome);
        aula1.obterDadosAula();
    }
}
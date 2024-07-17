//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Adotante adotante1 = new Adotante("Sebas", "123456789", "Rua", "123456789", "joao@asdasd.com");
        adotante1.obterDadosAdotante();

        Adocao adocao1 = new Adocao("01/01/2021", new Adotante(), new Arvore());
        adocao1.obterDadosAdocao();

        Manutencao manutencao1 = new Manutencao("01/01/2021", "Poda", new Arvore());
        manutencao1.obterDadosManutencao();

        Arvore arvore1 = new Arvore("Rua", "Boa", "Pau-Brasil");
        arvore1.obterDadosArvore();

        Evento evento1 = new Evento("Adoção", "01/01/2021", "Rua");
        evento1.obterDadosEvento();

    }
}
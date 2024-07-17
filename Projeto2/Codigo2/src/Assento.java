public class Assento {
    String numeroAssento, classe;
    boolean disponivel;

    public Assento(String parametroNumeroAssento, String parametroClasse, boolean parametroDisponivel) {
        numeroAssento = parametroNumeroAssento;
        classe = parametroClasse;
        disponivel = parametroDisponivel;
    }

    public Assento() {

    }

    public void obterDadosAssento() {
        System.out.println("---------------------------------------------------");
        System.out.println("Assento");
        System.out.print("Numero do Assento: " + numeroAssento);
        System.out.print(" Classe: " + classe);
        System.out.println(" Disponivel: " + disponivel);
    }
}
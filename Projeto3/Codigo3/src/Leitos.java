public class Leitos {
    int numeroDoLeito;
    boolean disponibilidade;

    public Leitos(int parametroNumeroDoLeito, boolean parametroDisponibilidade){
        numeroDoLeito = parametroNumeroDoLeito;
        disponibilidade = parametroDisponibilidade;
    }

    public Leitos(){

    }

    public void obterDadosLeitos(){
        System.out.println("------------------------------------------");
        System.out.println("Leitos");
        System.out.println("Leito: " + numeroDoLeito);
        System.out.println("Disponibilidade: " + disponibilidade);
    }
}
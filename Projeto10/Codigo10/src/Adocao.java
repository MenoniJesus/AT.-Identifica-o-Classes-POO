public class Adocao {
    String dataAdocao;
    Adotante adotante;
    Arvore arvore;

    public Adocao(String parametroDataAdocao, Adotante parametroAdotante, Arvore parametroArvore) {
        dataAdocao = parametroDataAdocao;
        adotante = parametroAdotante;
        arvore = parametroArvore;
    }

    public Adocao(){

    }

    public void obterDadosAdocao(){
        System.out.println("-----------------------------------------------");
        System.out.println("Adoção");
        System.out.print("Data da adoção: " + dataAdocao);
        System.out.print(" Adotante: " + adotante.nome);
        System.out.println(" Árvore: " + arvore.especie);
    }
}
public class Perfil {
    String nome, foto, status, amigos;

    public Perfil(String parametroNome, String parametroFoto, String parametroStatus, String parametroAmigos){
        nome = parametroNome;
        foto = parametroFoto;
        status = parametroStatus;
        amigos = parametroAmigos;
    }

    public Perfil(){

    }

    public void obterDadosPerfil(){
        System.out.println("-------------------------------------");
        System.out.println("Perfil");
        System.out.print("Nome: " + nome);
        System.out.print(" Foto: " + foto);
        System.out.print(" Status: " + status);
        System.out.println(" Amigos: " + amigos);
    }
}

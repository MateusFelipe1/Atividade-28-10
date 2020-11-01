public class App {
    public static void main(String[] args) throws Exception {
        Corrida disputa = new Corrida();

        disputa.pontuacao = 256;

        System.out.print("O favorito para esta corrida: ");
        disputa.setNome("Felipe Massa");
        System.out.println(disputa.getNome());

        System.out.print("Local onde será realizado a corrida: ");
        disputa.setLocal("Indianapolis");
        System.out.println(disputa.getLocal());

        System.out.println("Pontuacao do primeiro colocado: " + disputa.pontuacao );
        
        disputa.correr();
    }
}

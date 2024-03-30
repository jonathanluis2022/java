
public class Main {

    public String name;
    static String video = "começando Java do zero ";

    public static void main(String[] args) {
        Ser meuSerAnimal = new Cao("billi", 3, "Jonathan");
        Ser meuSerHumano = new Pessoa("jonathan", 34, "Luis");

        System.out.println(
                "O cao " + meuSerAnimal.getName() + ' ' + meuSerAnimal.getIdade() +
                        " anos" + " faz " + meuSerAnimal.saudacao());

        System.out.println(
                meuSerHumano.getName() + " de " + meuSerHumano.getIdade() + " anos" + " diz "
                        + meuSerHumano.saudacao());
    }
}

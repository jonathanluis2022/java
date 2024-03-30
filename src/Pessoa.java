
class Pessoa extends Ser {

    String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome) {
        super(nome, idade); // trouxemos o construct pq é obrigatorio e colocamos mais um atribulto
        this.sobrenome = sobrenome;
    }

    @Override
    public String saudacao() {
        return "Olla Tudo bem !";
    }

}
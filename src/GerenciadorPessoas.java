public class GerenciadorPessoas {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ladislau");
        pessoa.setIdade(21);

        System.out.println("Nome: " + pessoa.getNome() + ".");
        System.out.println("Idade: " + pessoa.getIdade() + ".");

    }
}

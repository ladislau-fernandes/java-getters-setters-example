public class ImprimePessoa {
    public void imprime(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + ":");
        System.out.println("Nome: " + pessoa.getNome() + ".");
        System.out.println("Idade: " + pessoa.getIdade() + ".");
        System.out.println("Sexo: " + pessoa.getSexo() + "." + "\n");
    }
}

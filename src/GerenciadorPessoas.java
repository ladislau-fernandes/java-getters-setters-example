public class GerenciadorPessoas {
    public static void main(String[] args) {
        ImprimePessoa imprimePessoa = new ImprimePessoa();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Ladislau");
        pessoa1.setIdade(21);
        pessoa1.setSexo('M');

        pessoa2.setNome("Fernandes");
        pessoa2.setIdade(21);
        pessoa2.setSexo('M');

        pessoa3.setNome("Marques");
        pessoa3.setIdade(21);
        pessoa3.setSexo('F');

        imprimePessoa.imprime(pessoa1);
        imprimePessoa.imprime(pessoa2);
        imprimePessoa.imprime(pessoa3);


    }
}

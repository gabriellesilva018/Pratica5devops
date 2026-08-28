/* 
CRIA A CLASSE PET
*/

public class Pet {
    String nome; 
    String especie;
    int idade;
    double ValorServico;
 

    // CRIA O CONSTRUTOR

    public Livro(String nome, String especie, int idade, double ValorSevico ){
        this.titulo = nome;
        this.autor = especie;
        this.preco = idade;
        this.ValorSevico = ValorServico;

    }

    // METODO PARA EXIBIR INFORMAÇÕES
    public void exibirInformacoes(){
        System.out.println("Titulo: " + nome);
        System.out.println("Autor: " + especie);
        System.out.println("Preço: " + idade);
        System.out.println("Quantidade: " + ValorServico);
    }

    // METODO VALOR COM DESCONTO

    public double calcularComDesconto(){
        return ValorServico * 0.90;

    }











}
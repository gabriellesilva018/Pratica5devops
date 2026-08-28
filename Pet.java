/* 
CRIA A CLASSE PET
*/

public class Pet {
    String nome; 
    String especie;
    int idade;
    double ValorServico;
 

    // CRIA O CONSTRUTOR

    public Pet(String nome, String especie, int idade, double ValorSevico ){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.ValorSevico = ValorServico;

    }

    // METODO PARA EXIBIR INFORMAÇÕES
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Especie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do Serviço: " + ValorServico);
    }

    // METODO VALOR COM DESCONTO

    public double calcularComDesconto(){
        return ValorServico * 0.90;

    }











}

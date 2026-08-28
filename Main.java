public class Main {

    // FUNÇAO PRINCIPAL 

    public static void main (String[] args) {
        System.out.println("=== PETSHOP DEVOPS ===");

        //CRIA O PET
        Pet pet1 = new PET("Rex", "Cachorro", 5, 150.00);
        Pet pet2 = new PET("Pandora", "Gata", 2, 100.00);
        Pet pet3 = new PET("Tempestade", "Cavalo",7, 300.00);

        System.out.println("\n pet1");
        livro1.exibirInformacoes();
        System.out.println("Valor do Serviço R$: " + pet1.calcularComDesconto());


        System.out.println("\n pet2");
        livro1.exibirInformacoes();
        System.out.println("Valor do Serviço R$: " + pet2.calcularComDesconto());

    System.out.println("\n pet3");
    livro1.exibirInformacoes();
    System.out.println("Valor do Serviço R$: " + pet3.calcularComDesconto());
    System.out.println("Aplicação executada com sucesso");    

    }
}

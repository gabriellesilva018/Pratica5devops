public class Main {

    // FUNÇAO PRINCIPAL 

    public static void main (String[] args) {
        System.out.println("=== PETSHOP DEVOPS ===");

        //CRIA O PET
        Pet pet1 = new Pet("Rex", "Cachorro", 5, 150.00);
        Pet pet2 = new Pet("Pandora", "Gata", 2, 100.00);
        Pet pet3 = new Pet("Tempestade", "Cavalo",7, 300.00);

        System.out.println("\n pet1");
        pet1.exibirInformacoes();
        System.out.println("Valor do Serviço R$: " + pet1.calcularComDesconto());


        System.out.println("\n pet2");
        pet2.exibirInformacoes();
        System.out.println("Valor do Serviço R$: " + pet2.calcularComDesconto());

    System.out.println("\n pet3");
    pet3.exibirInformacoes();
    System.out.println("Valor do Serviço R$: " + pet3.calcularComDesconto());
    System.out.println("Aplicação executada com sucesso");    

    }
}

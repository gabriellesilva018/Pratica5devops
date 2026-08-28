public class Main {

    // FUNÇAO PRINCIPAL 

    public static void main (String[] args) {
        System.out.println("=== PETSHOP DEVOPS ===");

        //CRIA O PET
        Pet Pet1 = new Pet("Rex", "Cachorro", 5, 150.00);
        Pet Pet2 = new Pet("Pandora", "Gata", 2, 100.00);
        Pet pet3 = new Pet("Tempestade", "Cavalo",7, 300.00);

        System.out.println("\n Pet1");
        Pet1.exibirInformacoes();
        System.out.println("Valor do Serviço R$: " + Pet1.calcularComDesconto());


        System.out.println("\n Pet2");
        Pet2.exibirInformacoes();
        System.out.println("Valor do Serviço R$: " + Pet2.calcularComDesconto());

    System.out.println("\n Pet3");
    Pet3.exibirInformacoes();
    System.out.println("Valor do Serviço R$: " + Pet3.calcularComDesconto());
    System.out.println("Aplicação executada com sucesso");    

    }
}

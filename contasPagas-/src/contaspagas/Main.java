package contasPagas;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Core i7", 200.0);
        Produto produto2 = new Produto("processador", 200.0);
        
        Cliente cliente1 = new Cliente("Alex", "111.111.111-11");
        Cliente cliente2 = new Cliente("Jose", "222.222.222-22");
        
        Conta conta1 = new Conta(1, "01/01/2023", "05/01/2023", produto1, cliente1);
        Conta conta2 = new Conta(2, "01/02/2023", "03/02/2023", produto2, cliente2);
        
        conta1.visualizarConta();
        System.out.println("------------------------------");
        conta2.visualizarConta();
    }
}


package banco;

public class Main {

    public static void main(String args[]){
        

       
        Funcionario f1 = new Funcionario("Alex", "TI", 2700.00, "25/02/2002", "5678788789", true);
        
        f1.mostra();
        
        f1.bonifica(500.00);
        f1.mostra();
        
        f1.demite();
        f1.mostra();
    }
}

    


    


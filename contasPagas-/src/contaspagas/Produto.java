package contasPagas;

public class Produto {
    private String descricaoProduto;
    private double valorProduto;
    
    public Produto(String descricaoProduto, double valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }
    
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    
    public double getValorProduto() {
        return valorProduto;
    }
}


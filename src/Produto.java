public class Produto {

    private String nome;
    private double preco;
    private int qtdEstoque;
    private Fornecedor fornecedor;

    public Produto(String nome, double preco, int qtdEstoque, Fornecedor fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}

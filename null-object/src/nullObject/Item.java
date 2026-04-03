package nullObject;

public class Item {
    private String nome;
    private double valor; 
    private Desconto desconto = new SemDesconto(); 

    public Item(String nome, double valor, Desconto desconto) {
        super();
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }

    public Item(String nome, double valor) {
        super();
        this.nome = nome;
        this.valor = valor;
    }

    public String toString() {
        return this.nome + " R$" + this.desconto.darDesconto(this.valor);
    }
    
    public double precoQuantidade(double quantidade) {
        return this.desconto.darDesconto(this.valor) * quantidade;
    }
}
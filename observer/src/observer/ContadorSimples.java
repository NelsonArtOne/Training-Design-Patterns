package observer;

public class ContadorSimples implements ContadorPalavras{
    private int qtd;

    @Override
    public void contar(String palavra) {
        this.qtd++;
    }

    @Override
    public int contagem() {
        return this.qtd;
    }
}

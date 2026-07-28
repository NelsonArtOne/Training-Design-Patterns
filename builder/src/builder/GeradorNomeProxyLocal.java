package builder;

public class GeradorNomeProxyLocal extends GeradorNome{
    private GeradorNome gerador;
    private String local;

    public GeradorNomeProxyLocal(GeradorNome gerador, String local) { 
        super(); 
        this.gerador = gerador;
        this.local = local;
    }

    public void setTratamento(Tratamento tratamento) {
        this.gerador.setTratamento(tratamento);
    }

    public Tratamento getTratamentoStrategy() {
        return this.gerador.getTratamentoStrategy();
    }

    public String gerarNome(String nomeBase) {
        return this.gerador.gerarNome(nomeBase) + " de " + this.local;
    }

    @Override
    protected String getTratamento() {
        return this.gerador.getTratamento();
    }
}

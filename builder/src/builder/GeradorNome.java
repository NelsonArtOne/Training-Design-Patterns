package builder;
public class GeradorNome { 
    
    private Tratamento tratamento = new NullTratamento(); 
    
    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public Tratamento getTratamentoStrategy() {
        return this.tratamento;
    }
    public String gerarNome(String nomeBase) {
        return tratamento.tratar() + this.getTratamento() + nomeBase;
    }

    protected String getTratamento() {
        return "";
    }

    
}
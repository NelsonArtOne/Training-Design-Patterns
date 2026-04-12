package proxy;

public class NegocioMock implements InterfaceNegócio {

    private boolean foiAcessado = false;
    
    @Override
    public void executaTransacao() {
       this.foiAcessado = true; 
    }

    @Override
    public void cancelaTransacao() {
        this.foiAcessado = true;
    }

    public boolean foiAcessado() {
        return this.foiAcessado;
    }

}

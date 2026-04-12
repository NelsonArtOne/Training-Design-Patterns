package proxy;

public class SegurancaNegocio implements InterfaceNegócio{
    
    private InterfaceNegócio encapsulado;
    private Usuario usuario;

    public SegurancaNegocio(InterfaceNegócio encapsulado, Usuario usuario) {
        this.encapsulado = encapsulado;
        this.usuario = usuario;
    }
    public void executaTransacao() {
        if(usuario.verificaPermissao("InterfaceNegocio", "executaTransacao")) {
            encapsulado.executaTransacao();
            
        } else {
            throw new RuntimeException();
        }
    }

    public void cancelaTransacao() {
        if(usuario.verificaPermissao("InterfaceNegocio", "cancelaTransacao()")) {
            encapsulado.cancelaTransacao();

        } else {
            throw new RuntimeException();
        }
        
    }
    
    
}

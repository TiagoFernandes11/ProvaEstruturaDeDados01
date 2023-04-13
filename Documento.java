public class Documento {
    private String titulo;
    private boolean assinado;

    public Documento(String titulo) {
        this.titulo = titulo;
        this.assinado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isAssinado() {
        return assinado;
    }

    public void setAssinado(boolean assinado) {
        this.assinado = assinado;
    }

    @Override
    public String toString() {
        return titulo;
    }

    



    
}

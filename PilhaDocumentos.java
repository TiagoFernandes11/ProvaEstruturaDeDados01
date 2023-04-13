import java.util.Arrays;

public class PilhaDocumentos {
    private Documento[] documentos;
    private int tamanho;

    public PilhaDocumentos() {
        this.documentos = new Documento[5];
        this.tamanho = 0;
    }

    public Documento assinar(){
        Documento documentoResposta = this.documentos[tamanho - 1];
        this.documentos[tamanho - 1].setAssinado(true);
        this.documentos[tamanho - 1] = null;
        this.tamanho--;
        return documentoResposta;
    }

    public void adicionar(Documento documento){
        if(this.documentos.length == tamanho){
            aumentaCapacidade();
        }
        this.documentos[this.tamanho] = documento;
        this.tamanho++;
    }

    private void aumentaCapacidade(){
        Documento[] arrayTemporario = new Documento[this.documentos.length * 2];
        for(int i = 0; i < documentos.length; i++){
            arrayTemporario[i] = this.documentos[i];
        }
        this.documentos = arrayTemporario;
    }

    public void exibir(){
        System.out.println(toString());
    }

    public Documento[] getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Documento[] documentos) {
        this.documentos = documentos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < documentos.length; i++){
            if(documentos[i] != null){
                s += documentos[i] + "\n";
            }
    }
    return s;
}

    
    
    
}

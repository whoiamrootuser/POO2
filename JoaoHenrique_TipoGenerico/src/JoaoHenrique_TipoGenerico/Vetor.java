package JoaoHenrique_TipoGenerico;

import java.util.ArrayList;
import java.util.List;

public class Vetor <T extends Object> {

    private List<T> vet;
    private int tamanho;
    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vet = new ArrayList<>(tamanho);
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public void setVet(T vet) {
        this.vet.add(vet);
    }
    public int getTamanho() {
        return tamanho;
    }

    public List<T> getVet() {
        return this.vet;
    }
//

 }

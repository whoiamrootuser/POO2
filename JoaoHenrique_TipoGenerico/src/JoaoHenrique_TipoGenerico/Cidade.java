package JoaoHenrique_TipoGenerico;

public class Cidade {
    //  Cidade
    // - Possui os atributos privativos: nome, adjetivo e estado. Essa classe contém o
    // construtor e todos os métodos getters e setters.
    private String nome;
    private String adjetivo;
    private String estado;
    public Cidade() {
    }
    public Cidade(String nome, String adjetivo, String estado) {
        this.nome = nome;
        this.adjetivo = adjetivo;
        this.estado = estado;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAdjetivo(String adjetivo) {
        this.adjetivo = adjetivo;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getNome() {
        return nome;
    }
    public String[] getAdjetivo() {
        return adjetivo.split("/");
    }
    
    public String getEstado() {
        return estado;
    }
}

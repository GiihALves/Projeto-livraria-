package SistemaLivraria;

public class Autor {
    private String nome;
    private String SObrenome;
    private String generoLiterario;
    private String sexo;
    private String pais;
    private String cidade;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSObrenome() {
        return SObrenome;
    }

    public void setSObrenome(String SObrenome) {
        this.SObrenome = SObrenome;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String listarAutor() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", SObrenome='" + SObrenome + '\'' +
                ", generoLiterario='" + generoLiterario + '\'' +
                ", sexo='" + sexo + '\'' +
                ", pais='" + pais + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Autor(String nome, String SObrenome, String generoLiterario, String sexo, String pais, String cidade, int idade) {
        this.nome = nome;
        this.SObrenome = SObrenome;
        this.generoLiterario = generoLiterario;
        this.sexo = sexo;
        this.pais = pais;
        this.cidade = cidade;
        this.idade = idade;
    }
}

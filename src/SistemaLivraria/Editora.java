package SistemaLivraria;

public class Editora {
    private String nome;
    private String ano;
    private String CNPJ;
    private String endereço;
    private String pais;
    private String estado;

    public String ListarEditora() {
        return "editora{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", endereço='" + endereço + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public Editora(String nome, String ano, String CNPJ, String endereço, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.CNPJ = CNPJ;
        this.endereço = endereço;
        this.pais = pais;
        this.estado = estado;


    }
}

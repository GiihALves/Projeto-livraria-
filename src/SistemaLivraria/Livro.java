package SistemaLivraria;

import java.security.PublicKey;

public class Livro {
    private String titulo;
    private int totalPaginas;
    private String aberto;
    private String genero;
    private String autor;
    private String editora;
    private int paginaAtual;
    private String anoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public String getAberto() {
        return aberto;
    }

    public void setAberto(String aberto) {
        this.aberto = aberto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String titulo, int totalPaginas, String aberto, String genero, String autor, String editora, int paginaAtual, String anoPublicacao) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.aberto = aberto;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginaAtual = paginaAtual;
        this.anoPublicacao = anoPublicacao;
    }

    public String listarDados() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", aberto='" + aberto + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", paginaAtual=" + paginaAtual +
                ", anoPublicacao='" + anoPublicacao + '\'' +
                '}';
    }
    public void abrirLivro(){

    }
}





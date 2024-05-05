package controlebiblioteca.model;

import java.util.Objects;

public class Livro {
    private String codigoLivro;
    private String titulo;
    private String autor;
    private String editora;
    private Integer ano;

    public Livro(String codigoLivro, String titulo, String autor, String editora, Integer ano) {
        // codigoLivro é uma variável locall
        // this.codigoLivro é um atributo
        this.codigoLivro = codigoLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" + "codigoLivro=" + codigoLivro + ", titulo=" + titulo + ", autor=" +
                autor + ", editora=" + editora + ", ano=" + ano + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.codigoLivro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.codigoLivro, other.codigoLivro)) {
            return false;
        }
        return true;
    }
}

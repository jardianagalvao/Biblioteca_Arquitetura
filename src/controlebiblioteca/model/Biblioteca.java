package controlebiblioteca.model;

import java.util.Objects;

public class Biblioteca {
    private int idBiblioteca;
    private String nome;
    private String endereco;
    private String telefone;

    public Biblioteca(int idBiblioteca, String nome, String endereco, String telefone) {
        this.idBiblioteca = idBiblioteca;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return "Biblioteca{" +
                "idBiblioteca=" + idBiblioteca +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idBiblioteca;
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
        final Biblioteca other = (Biblioteca) obj;
        if (this.idBiblioteca != other.idBiblioteca) {
            return false;
        }
        return true;
    }
}

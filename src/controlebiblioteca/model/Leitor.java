package controlebiblioteca.model;

import java.util.Objects;

public class Leitor {
    private int idLeitor;
    private String nome;
    private String endereco;
    private String email;

    public Leitor(int idLeitor, String nome, String endereco, String email) {
        this.idLeitor = idLeitor;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return "Leitor{" +
                "idLeitor=" + idLeitor +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idLeitor;
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
        final Leitor other = (Leitor) obj;
        if (this.idLeitor != other.idLeitor) {
            return false;
        }
        return true;
    }
}

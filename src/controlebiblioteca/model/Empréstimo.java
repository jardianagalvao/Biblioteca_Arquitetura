package controlebiblioteca.model;

import java.util.Objects;

public class Empréstimo {
    private int idEmpréstimo;
    private Livro livro;
    private Leitor leitor;
    private Biblioteca biblioteca;

    public Empréstimo(int idEmpréstimo, Livro livro, Leitor leitor, Biblioteca biblioteca) {
        this.idEmpréstimo = idEmpréstimo;
        this.livro = livro;
        this.leitor = leitor;
        this.biblioteca = biblioteca;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return "Empréstimo{" +
                "idEmpréstimo=" + idEmpréstimo +
                ", livro=" + livro +
                ", leitor=" + leitor +
                ", biblioteca=" + biblioteca +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idEmpréstimo;
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
        final Empréstimo other = (Empréstimo) obj;
        if (this.idEmpréstimo != other.idEmpréstimo) {
            return false;
        }
        return true;
    }
}

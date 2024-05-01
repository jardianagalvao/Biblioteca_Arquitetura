package controlebiblioteca.control;

import controlebiblioteca.model.ControleLivros;
import controlebiblioteca.model.Livro;
import controlebiblioteca.view.TelaManutencaoLivros;

public class ControleBiblioteca {
    private ControleLivros controleLivros;
    private TelaManutencaoLivros tml;

    public ControleBiblioteca() {
        controleLivros = new ControleLivros();
        tml = new TelaManutencaoLivros();
    }

    public static void main(String[] args) {
        ControleBiblioteca cb = new ControleBiblioteca();
        TelaManutencaoLivros tml = new TelaManutencaoLivros();
        tml.setVisible(true);
    }

    public void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {
        Livro umLivro = new Livro(
                tml.getCodigoLivro(),
                tml.getTituloLivro(),
                tml.getAutor(),
                tml.getISBN(),
                Integer.parseInt(tml.getAno()));
        controleLivros.incluirLivro(umLivro);
    }
}

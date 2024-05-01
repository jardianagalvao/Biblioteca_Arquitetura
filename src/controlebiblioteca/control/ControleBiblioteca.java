package controlebiblioteca.control;

import controlebiblioteca.model.ControleLivros;
import controlebiblioteca.model.Livro;
import controlebiblioteca.view.TelaManutencaoLivros;

public class ControleBiblioteca { // Corrigido o nome da classe para seguir convenções de nomenclatura
    private ControleLivros controleLivros; // Adicione uma referência para a classe ControleLivros
    private TelaManutencaoLivros tml; // Declare uma variável para armazenar a referência à tela

    public ControleBiblioteca() { // Adicione um construtor para inicializar o ControleLivros
        controleLivros = new ControleLivros();
        tml = new TelaManutencaoLivros(); // Inicialize a tela
    }

    public static void main(String[] args) {
        ControleBiblioteca cb = new ControleBiblioteca(); // Corrigido o nome da classe para seguir convenções de
                                                          // nomenclatura
        TelaManutencaoLivros tml = new TelaManutencaoLivros();
        tml.setVisible(true);
    }

    public void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {
        Livro umLivro = new Livro(
                tml.getCodigoLivro(), // Supondo que você tem métodos para obter esses campos da tela
                tml.getTituloLivro(),
                tml.getAutor(),
                tml.getISBN(),
                Integer.parseInt(tml.getAno()));
        controleLivros.incluirLivro(umLivro);
    }
}

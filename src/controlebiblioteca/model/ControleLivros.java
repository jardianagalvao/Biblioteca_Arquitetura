package controlebiblioteca.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControleLivros {
    private Connection connection;

    public ControleLivros() {
        try {
            // Estabelecer conexão com o banco de dados
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "1337");
        } catch (SQLException e) {
            e.printStackTrace();
            // Lidar com erro de conexão
        }
    }

    public void incluirLivro(Livro livro) {
        String sql = "INSERT INTO livros (codigo, titulo, autor, ISBN, ano) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, livro.getCodigoLivro());
            statement.setString(2, livro.getTitulo());
            statement.setString(3, livro.getAutor());
            statement.setString(4, livro.getISBN());
            statement.setInt(5, livro.getAno());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Lidar com erro de inclusão
        }
    }

    public void excluirLivro(String codigoLivro) {
        String sql = "DELETE FROM livros WHERE codigo = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, codigoLivro);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Lidar com erro de exclusão
        }
    }

    public void alterarLivro(Livro livro) {
        String sql = "UPDATE livros SET titulo = ?, autor = ?, ISBN = ?, ano = ? WHERE codigo = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, livro.getTitulo());
            statement.setString(2, livro.getAutor());
            statement.setString(3, livro.getISBN());
            statement.setInt(4, livro.getAno());
            statement.setString(5, livro.getCodigoLivro());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Lidar com erro de atualização
        }
    }

    public Livro consultarLivro(String codigoLivro) {
        Livro livro = null;
        String sql = "SELECT * FROM livros WHERE codigo = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, codigoLivro);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                livro = new Livro(
                        resultSet.getString("codigo"),
                        resultSet.getString("titulo"),
                        resultSet.getString("autor"),
                        resultSet.getString("ISBN"),
                        resultSet.getInt("ano"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Lidar com erro de consulta
        }
        return livro;
    }

    public List<Livro> listarLivros() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livros";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Livro livro = new Livro(
                        resultSet.getString("codigo"),
                        resultSet.getString("titulo"),
                        resultSet.getString("autor"),
                        resultSet.getString("ISBN"),
                        resultSet.getInt("ano"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Lidar com erro de consulta
        }
        return livros;
    }
}

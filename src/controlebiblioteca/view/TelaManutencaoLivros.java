package controlebiblioteca.view;

import java.util.List;

import javax.swing.JOptionPane;

import controlebiblioteca.model.Livro;

public class TelaManutencaoLivros extends javax.swing.JFrame {
    private controlebiblioteca.model.ControleLivros controleLivros;

    public TelaManutencaoLivros() {
        controleLivros = new controlebiblioteca.model.ControleLivros();
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codigoLivro = new javax.swing.JTextField();
        tituloLivro = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        ano = new javax.swing.JTextField();
        botaoConsultar = new javax.swing.JButton();
        botaoIncluir = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton(); // Adicionando botão para limpar campos
        botaoListar = new javax.swing.JButton(); // Adicionando botão para listar livros

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Arquitetura");

        jLabel1.setText("Sistema Controle de Biblioteca");

        jLabel2.setText("Código do Livro:");

        jLabel3.setText("Título do Livro:");

        jLabel4.setText("Autor:");

        jLabel5.setText("ISBN:");

        jLabel6.setText("Ano:");

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoIncluir.setText("Incluir");
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar"); // Configurando botão para limpar campos
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoListar.setText("Listar"); // Adicionando botão para listar livros
        botaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(152, 152, 152)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ano,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(isbn,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(autor,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tituloLivro,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(codigoLivro,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(botaoConsultar)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(botaoIncluir)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(botaoExcluir)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(botaoAlterar)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(botaoLimpar)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(botaoListar)))))
                                .addContainerGap(154, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(codigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(tituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoConsultar)
                                        .addComponent(botaoIncluir)
                                        .addComponent(botaoExcluir)
                                        .addComponent(botaoAlterar)
                                        .addComponent(botaoLimpar)
                                        .addComponent(botaoListar)) // Adicionando botão ao layout
                                .addContainerGap(50, Short.MAX_VALUE)));

        pack();
    }

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoLivro = this.codigoLivro.getText();
        controlebiblioteca.model.Livro umLivro = controleLivros.consultarLivro(codigoLivro);
        if (umLivro != null) {
            this.tituloLivro.setText(umLivro.getTitulo());
            this.autor.setText(umLivro.getAutor());
            this.isbn.setText(umLivro.getISBN());
            this.ano.setText(String.valueOf(umLivro.getAno()));
        } else {
            JOptionPane.showMessageDialog(null, "Livro Inexistente");
        }
    }

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {
        controlebiblioteca.model.Livro umLivro = new controlebiblioteca.model.Livro(
                this.codigoLivro.getText(),
                this.tituloLivro.getText(),
                this.autor.getText(),
                this.isbn.getText(),
                Integer.parseInt(this.ano.getText()));
        controleLivros.incluirLivro(umLivro);
        JOptionPane.showMessageDialog(null, "Livro incluído com sucesso!");
    }

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoLivro = this.codigoLivro.getText();
        controleLivros.excluirLivro(codigoLivro);
        JOptionPane.showMessageDialog(null, "Livro excluído com sucesso!");
    }

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        controlebiblioteca.model.Livro umLivro = new controlebiblioteca.model.Livro(
                this.codigoLivro.getText(),
                this.tituloLivro.getText(),
                this.autor.getText(),
                this.isbn.getText(),
                Integer.parseInt(this.ano.getText()));
        controleLivros.alterarLivro(umLivro);
        JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!");
    }

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {
        // Limpar todos os campos da tela
        codigoLivro.setText("");
        tituloLivro.setText("");
        autor.setText("");
        isbn.setText("");
        ano.setText("");
    }

    private void botaoListarActionPerformed(java.awt.event.ActionEvent evt) {
        // Listar todos os livros cadastrados
        List<Livro> listaLivros = controleLivros.listarLivros();

        // Criar uma string para armazenar os detalhes de cada livro
        StringBuilder livrosStr = new StringBuilder();
        for (Livro livro : listaLivros) {
            livrosStr.append("Código: ").append(livro.getCodigoLivro()).append(", ")
                    .append("Título: ").append(livro.getTitulo()).append(", ")
                    .append("Autor: ").append(livro.getAutor()).append(", ")
                    .append("ISBN: ").append(livro.getISBN()).append(", ")
                    .append("Ano: ").append(livro.getAno()).append("\n");
        }

        // Exibir a lista de livros como uma mensagem
        JOptionPane.showMessageDialog(null, livrosStr.toString(), "Livros Cadastrados",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaManutencaoLivros().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField ano;
    private javax.swing.JTextField autor;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoLimpar; // Adicionando botão de limpar
    private javax.swing.JButton botaoListar; // Adicionando botão para listar livros
    private javax.swing.JTextField codigoLivro;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tituloLivro;

    public String getCodigoLivro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCodigoLivro'");
    }

    public String getTituloLivro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTituloLivro'");
    }

    public String getAutor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAutor'");
    }

    public String getISBN() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getISBN'");
    }

    public String getAno() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAno'");
    }
}


Sistema de Controle de Biblioteca
Este é um projeto de sistema de controle de biblioteca desenvolvido para a disciplina de Arquitetura de Sistemas da Universidade de Fortaleza (Unifor).

Descrição
O sistema de controle de biblioteca permite gerenciar o acervo de livros de uma biblioteca, oferecendo funcionalidades como cadastro de livros, consulta, exclusão e alteração de informações. Além disso, o sistema também inclui a implementação de um serviço web para demonstrar uma funcionalidade que a aplicação pode consultar.

Padrões Utilizados
O projeto foi desenvolvido seguindo os padrões MVC (Model-View-Controller) e camadas (layers), garantindo uma organização estrutural clara e separação de responsabilidades. A arquitetura MVC divide a aplicação em três componentes principais:

Model: Responsável pela lógica de negócios e acesso aos dados.
View: Responsável pela interface do usuário e apresentação dos dados.
Controller: Responsável pela comunicação entre o Model e a View, interpretando as entradas do usuário e direcionando as ações apropriadas.
Além disso, a arquitetura em camadas separa a aplicação em diferentes níveis de abstração, como apresentação, lógica de negócios e acesso aos dados, promovendo uma melhor organização e manutenção do código.

Implementação do Serviço
Como parte do projeto, foi implementado um serviço web para demonstrar uma funcionalidade que a aplicação pode consultar. O serviço foi desenvolvido seguindo os princípios REST (Representational State Transfer), garantindo uma comunicação eficiente e escalável entre os diferentes componentes da aplicação.

O serviço pode ser acessado através de uma API RESTful, oferecendo endpoints para realizar operações específicas, como consulta de informações sobre livros, autores, editoras, entre outros.

Tecnologias Utilizadas
O projeto foi desenvolvido utilizando as seguintes tecnologias:

Linguagem de Programação: Java
Framework: Spring Boot (para o serviço web)
Banco de Dados: MySQL
Ferramentas de Desenvolvimento: Visual Studio Code, Git

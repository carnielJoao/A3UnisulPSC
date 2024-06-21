# 📚 Sistema de Gerenciamento de Estoque para Livrarias

Descrição: 

Este projeto é um sistema de gerenciamento de estoque voltado para livrarias. Ele permite o controle eficiente de inventário, incluindo adição, remoção e atualização de informações sobre livros, bem como a geração de relatórios de estoque. O objetivo é simplificar o processo de gerenciamento de inventário e fornecer uma ferramenta robusta para livreiros.

Funcionalidades:

- Cadastro de Livros: Adicione novos livros ao sistema com informações detalhadas como título, autor, gênero, preço e quantidade em estoque.

- Atualização de Estoque: Atualize a quantidade de livros em estoque de forma fácil e rápida.

- Geração de Relatórios: Crie relatórios detalhados sobre o inventário, valor total dos livros em estoque e quantidade de funcionarios.

- Cadastro de Funcionarios: Adicione novos funcionarios ao sistema com informações detalhadas como nome, cpf, escolariedade, salario...

- Atualização das informações dos funcionarios na tela de gerenciamento.


Tecnologias Utilizadas:

- Front-end: JAVA SWING
- Back-end: JAVA
- Banco de Dados: MySql

Instalação(Passo a Passo):

1 - Abra o netbeans, clique em "File" vai aparecer varias opções clique em "New Project" logo após clicar vai aparecer uma tela,escolha a categoria de "Java with Ant" e selecione "Java Application" e aperte o botão "Next". Agora vai aparecer outra tela com varios campos no primeiro(Project Name) escreva ProjetoFinal, no ultimo(Create Main Class) escreva Principal.Principal e aperte o "Finish".

2 - Agora precisa baixar os arquivos certos que estão nesse diretorio git, clique na pasta "ProjetoFinal" logo após clique em "src" vai mostrar quatro pastas (DAO, Model, Principal e View) copie todas elas para sua área de trabalho

3 - Ache a pasta raiz onde o netbeans salva os arquivos dos seus projetos, lá vai ta a pasta que voce criou anteriormente, abra ela dentro dela vai ter a pasta "src" clique nela e coloque os arquivos que estão na área de trabalho dentro.

4 - Pronto, estamos quase lá precisamos fazer uns ajustes ainda, dentro do netbeans voce vai abrir o projeto, vai aparecer algumas pastas clique com o botão direito do mouse na pasta com nome "Libraries" vai aparecer a opção "Add JAR/Folder" clique nela e adicione o arquivo "mysql-connector-j-8.3.0.jar" precisa baixar na internet.

Configure o banco de dados:

1 - Como esse sistema usa um banco local, voce precisa configurar ele na sua maquina, precisa ter instalado o MySql server e o MySql Worbench, quando abrir o mysql Worbench voce vai criar uma nova conexão, de preferencia username "root" e a senha a mesma que foi usada no codigo "210195", no campo Default Schema escrever "db_inshelf".

2 - Dentro da pasta ProjetoFinal tem uma pasta com o nome de "Dump20240621", dentro dela tem os arquivos com os comandos Sql, copie e execute os comandos sql.

Desenvolvido por João Victor Carniel. Entre em contato pelo LinkedIn.

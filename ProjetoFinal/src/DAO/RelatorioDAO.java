package dao;

import java.sql.*;

public class RelatorioDAO {
    
    // Faz a conexão com o Banco
    public Connection getConexao() {
        Connection connection = null;  //instância da conexão

        try {
            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conexão
            String server = "localhost"; // caminho do MySQL
            String database = "db_inshelf";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "210195";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver não foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar...");
            return null;
        }
    }

    public double getTotalEstoque() throws SQLException {
        String query = "SELECT SUM(quantidade_produto * preco_produto) AS total_estoque FROM tb_estoque";
        try (Connection connection = getConexao();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                return resultSet.getDouble("total_estoque");
            }
        }
        return 0;
    }

    public int getTotalProdutosDiferentes() throws SQLException {
        String query = "SELECT COUNT(DISTINCT id_produto) AS total_produtos_diferentes FROM tb_estoque";
        try (Connection connection = getConexao();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                return resultSet.getInt("total_produtos_diferentes");
            }
        }
        return 0;
    }

    public int getTotalFuncionarios() throws SQLException {
        String query = "SELECT COUNT(DISTINCT id_funcionarios) AS total_funcionarios FROM tb_funcionarios";
        try (Connection connection = getConexao();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                return resultSet.getInt("total_funcionarios");
            }
        }
        return 0;
    }

    public int getTotalQuantidade() throws SQLException {
        String query = "SELECT SUM(quantidade_produto) AS total_quantidade FROM tb_estoque";
        try (Connection connection = getConexao();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                return resultSet.getInt("total_quantidade");
            }
        }
        return 0;
    }
}
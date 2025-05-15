package concessionaria;

import java.sql.*;

public class CarroDAO {
    private Connection connection;
    
    public CarroDAO() {
        this.connection = new ConnectionFactory().connectDB();
    }
    
    public void createCarro(Carro carro) throws SQLException{
        String sql = "insert";
        
        PreparedStatement stmt;
        stmt = null;
        
        try {
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, carro.getMarca());
            stmt.setInt(2, carro.getAno());
            stmt.setBoolean(3, carro.isTipo());
            stmt.setString(4, carro.getPortas());
            
            stmt.executeUpdate();
            
            System.out.println("Deu certo");
            
        } catch (SQLException erro) {
            System.out.println("Deu ruim " + erro.getMessage());
        }
        
        finally{
            if(stmt != null)
                stmt.close();
        }
    }
}

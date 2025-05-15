package biblioteeca;


import java.sql.*;

public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().connectDB();
    }
    
    public void criaUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO tb_usuario (nome, email, telefone, tipo_usuario) VALUES(?,?,?,?)";
        
        PreparedStatement stmt;
        stmt = null;
        
        try {
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefone());
            stmt.setString(4, usuario.getTipo_usuario());
            
            stmt.executeUpdate();
            
            System.out.println("Deu certo");
        } catch (SQLException e) {
            System.out.println("Deu ruim" + e.getMessage());
        }
        finally{
            if(stmt != null)
                stmt.close();
        }
    }
}

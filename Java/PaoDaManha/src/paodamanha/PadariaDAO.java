package paodamanha;

import java.sql.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.JOptionPane;

public class PadariaDAO {

    private Connection connection;

    public PadariaDAO() {
        this.connection = new ConnectionFactory().connectDB();
    }
    
    public void criaUsuario(Padaria padaria) throws SQLException{
        String sql = "INSERT INTO tb_usuario (nome, email, telefone) VALUES(?,?,?)";
        
        PreparedStatement stmt;
        stmt = null;
        
        try {
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, padaria.getNome());
            stmt.setString(2, padaria.getEmail());
            stmt.setString(3, padaria.getTelefone());
            
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
    
    public List<Padaria> listarUsuarios() throws SQLException {
        List<Padaria> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_usuario";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                Padaria padaria = new Padaria("", "", "");
                
                // padaria.setId(rs.getInt("id_usuario"));
                padaria.setNome(rs.getString("nome"));
                padaria.setEmail(rs.getString("email"));
                padaria.setTelefone(rs.getString("telefone"));
                
                lista.add(padaria);
            }
        } catch (SQLException erro) {
            System.out.println("Erro" + erro.getMessage());
        }
        
        finally{
            if(rs != null)
                rs.close();
            if(pstm != null)
                pstm.close();
        }
        return lista;
    }
    
    // Deletar
    
    public void deleteAluno(String nome) throws SQLException{
        String sql = "DELETE FROM tb_usuario WHERE nome LIKE ?";
        
        PreparedStatement stmt;
        stmt = null;
        
        try {
            stmt = connection.prepareStatement(sql);
            
            
            stmt.setString(1, "%"+nome+"%");
            
            stmt.executeUpdate();
            
            System.out.println("Delete feito");
        } catch (Exception erro) {
            System.out.println("Deu Erro" + erro.getMessage());
        }
        
        finally{
            if(stmt != null)
                stmt.close();
        }
    }
    
    // Buscar por nome
    
    private final JframeDeletar jframedeletar = new JframeDeletar();
    
    private void buscarAlunoPorNome(String nome) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            ConnectionFactory cf = new ConnectionFactory(); 
            conn = cf.connectDB(); 

            String sql = "SELECT nome, email, telefone FROM tb_usuario WHERE nome LIKE ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%"+nome+"%");
            rs = pstmt.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel();

            // Define as colunas da tabela
            tableModel.addColumn("Nome");
            tableModel.addColumn("Email");
            tableModel.addColumn("Telefone");
  

            if (rs.next()) {
                // Adiciona a linha com os dados do aluno encontrado
                Vector<Object> row = new Vector<>();
                row.add(rs.getString("Nome"));
                row.add(rs.getString("Email"));
                row.add(rs.getString("Telefone"));
                tableModel.addRow(row);
            } else {
                //JOptionPane.showMessageDialog(this,"Nenhum aluno encontrado com o nome : " + nome, "Informação", JOptionPane.INFORMATION_MESSAGE);
            }

           jframedeletar.tabelaDeletarBuscar.setModel(tableModel);

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(this, "Erro ao buscar o aluno: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Feche a conexão, o PreparedStatement e o ResultSet no bloco finally para garantir que sejam fechados mesmo em caso de erro.
            try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    // Updade
    
    public void UpdatePadaria(){
        Connection conn = null;
        PreparedStatement psmt;
        ResultSet rs = null;
        
        
        psmt = null;
        
        
        try {
            
            ConnectionFactory cf = new ConnectionFactory();
            conn = cf.connectDB();
            String sql = "UPDATE tb_usuario SET nome = ?, cpf = ?, sexo = ?, endereco = ?, curso = ?, matricula = ?  WHERE id_usuario = ?";
            psmt = conn.prepareStatement(sql);
            
//            psmt.setString(1, textName.getText());
//            psmt.setString(2, textCpf.getText());
//            psmt.setString(3, (String) textSexo.getSelectedItem());
//            psmt.setString(4, textEndereco.getText());
//            psmt.setString(5, textCurso.getText());
//            psmt.setString(6, textMatricula.getText());
//            psmt.setString(7, textId.getText());
            psmt.executeUpdate();
            
            // SELECT
            String sqlSelect = "SELECT nome, matricula, sexo, cpf, endereco, curso FROM tb_usuario WHERE id_usuario = ?";
            psmt = conn.prepareStatement(sqlSelect);
//            psmt.setString(1, textId.getText());
            rs = psmt.executeQuery();
                    
            DefaultTableModel tableModel = new DefaultTableModel();

            // Define as colunas da tabela
            tableModel.addColumn("Nome");
            tableModel.addColumn("Matrícula");
            tableModel.addColumn("Sexo");
            tableModel.addColumn("CPF");
            tableModel.addColumn("Endereço");
            tableModel.addColumn("Curso");
            
             if (rs.next()) {
                // Adiciona a linha com os dados do aluno encontrado
                Vector<Object> row = new Vector<>();
                row.add(rs.getString("nome"));
                row.add(rs.getString("matricula"));
                row.add(rs.getString("sexo"));
                row.add(rs.getString("cpf"));
                row.add(rs.getString("endereco"));
                row.add(rs.getString("curso"));
                tableModel.addRow(row);
            } else {
                //JOptionPane.showMessageDialog(this, "Nenhum aluno encontrado com o ID: " , "Informação", JOptionPane.INFORMATION_MESSAGE);
            }

           // TableUpdate.setModel(tableModel);
        } catch (Exception e) {
            System.out.println("Nao foi " + e.getMessage());
        } 
    }
}



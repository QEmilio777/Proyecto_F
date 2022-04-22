
package clientes;


import conex.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SqlUsuarios extends conexion{
    
    public boolean registrar(Usuarios usr){
        
        PreparedStatement ps = null;
        Connection con = conexion();
        
        String sql = "insert into usuarios (NombreUsuario,Nombre,Apellido,Telefono,Email,Contraseña) values(?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getNombre());
            ps.setString(3, usr.getApellido());
            ps.setString(4, usr.getTelefono());
            ps.setString(5, usr.getEmail());
            ps.setString(6, usr.getContraseña());
            
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
    }
    
    public boolean login(Usuarios usr){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        
        String sql = "select idusuarios,NombreUsuario,Contraseña,Nombre from usuarios where NombreUsuario = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (usr.getContraseña().equals(rs.getString(3))) {
                    
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    return true;
                }else{
                return false;
                
                }
            }
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
    }
    
    public int existeUsuario(String usuario){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        
        String sql = "select count(idusuarios) from usuarios where NombreUsuario = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
            
        }
    }
    
    public int existeProducto(String productoNombre){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        
        String sql = "select count(idProducto) from productos where NombreProducto = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, productoNombre);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
            
        }
    }
    
    public boolean esEmail(String correo){
        
        Pattern pattern = Pattern.compile("^[A-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[A-Z0-9_!#$%&'*+/=?`{|}~^-]+↵\n" +
				")*@[A-Z0-9-]+(?:\\.[A-Z0-9-]+)*$", Pattern.CASE_INSENSITIVE);
	Matcher matcher = pattern.matcher(correo);
	return matcher.find();
    
    }
    
    
}

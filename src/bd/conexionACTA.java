/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;


import automatizacionfb.Acciones;
import automatizacionfb.Acta.Acta;
import automatizacionfb.Acta.Imagenes;
import automatizacionfb.Candidaturas.CandEspecial;
import automatizacionfb.Candidaturas.CandPresidencia;
import automatizacionfb.Candidaturas.CandUninominal;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author archlinux
 */
public class conexionACTA {
    
    String dbURL = "jdbc:mysql://";
    String username = "root";
    String password = "";
    Connection conn;
    
    public conexionACTA(String ip) throws SQLException {
        this.conectar(ip);
    }
    
    public void conectar(String ip) throws SQLException {
        
        conn = (Connection) DriverManager.getConnection(dbURL+ip+":3306/actas", username, password);
        
        if (conn != null) {
            System.out.println("Connected");
        }
        
    }
    
    public void desconectar() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
    
    public Connection getConn() {
        return conn;
    }

    public void insertarObjeto(Imagenes img) throws SQLException {
        String sql = "INSERT INTO `imagenes` (`id`, `CODIGO_MESA`, `imagenActa`, `srcImagen`, `imagenProveido`, `srcProveido`) VALUES (NULL, ?, ?, ?, ?, ?);";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, img.getActa().getCodMesa());
        statement.setString(2, "" + img.imagenActaGuardado());
        statement.setString(3, img.getSrcActa());
        statement.setString(4, "" + img.imagenProveidoGuardado());//se guardo el acta?
        statement.setString(5, img.getSrcProveido());
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Nueva imagen insertada");
        }
        System.out.println("-------------------------------------");
        img.mostrar();
        System.out.println("-------------------------------------");
    }

    public void insertarObjeto(Acta acta) throws SQLException {
        String sql = "INSERT INTO `geografia` (`CODIGO_MESA`, `PAIS`, `DEPARTAMENTO`, `PROVINCIA`, `MUNICIPIO`, `LOCALIDAD`, `RECINTO`, `NUMERO_MESA`, `INSCRITOS_HABILITADOS`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "" + acta.getCodMesa());
        statement.setString(2, "" + acta.getPais());
        statement.setString(3, "" + acta.getDepartamento());
        statement.setString(4, "" + acta.getProvincia());
        statement.setString(5, "" + acta.getMunicipio());
        statement.setString(6, "" + acta.getLocalidad());
        statement.setString(7, "" + acta.getRecinto());
        statement.setString(8, "" + acta.getNumMesa());
        statement.setString(9, "" + acta.getNumInscritos());
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Nueva acta insertada");
        }
    }
    
    public void insertarObjeto(CandPresidencia presidencia, int idActa) throws SQLException {
        String sql = "INSERT INTO `candidaturaPresidente` (`id`, `CODIGO_MESA`, `CREEMOS`, `ADN`, `MAS_IPSP`, `FPV`, `PAN_BOL`, `LIBRE_21`, `CC`, `JUNTOS`, `VOTO_VALIDO`, `VOTO_BLANCO`, `VOTO_NULO`, `VOTO_EMITIDO`, `VOTO_VALIDO_SISTEMA`, `VOTO_EMITIDO_SISTEMA`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idActa);
        statement.setInt(2, presidencia.getCREEMOS());
        statement.setInt(3, presidencia.getADN());
        statement.setInt(4, presidencia.getMASIPSP());
        statement.setInt(5, presidencia.getFPV());
        statement.setInt(6, presidencia.getPANBOL());
        statement.setInt(7, presidencia.getLIBRE21());
        statement.setInt(8, presidencia.getCC());
        statement.setInt(9, presidencia.getJUNTOS());
        statement.setInt(10, presidencia.getVotosValidos());
        statement.setInt(11, presidencia.getVotoBlanco());
        statement.setInt(12, presidencia.getVotoNulo());
        statement.setInt(13, presidencia.getVotoEmitido());
        statement.setInt(14, presidencia.getVotoValidoSistema());
        statement.setInt(15, presidencia.getVotoEmitidoSistema());
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Nueva presidencia insertada");
        }
    }
    
    public void insertarObjeto(CandEspecial presidencia, int idActa) throws SQLException {
        String sql = "INSERT INTO `candidaturaEspecial` (`id`, `CODIGO_MESA`, `CREEMOS`, `ADN`, `MAS_IPSP`, `FPV`, `PAN_BOL`, `LIBRE_21`, `CC`, `JUNTOS`, `APG`, `CPEM_B`, `CIDOB`, `BIA_YUQUI`, `CONAMAQ`, `OICH`, `ORCAWETA`, `YAMINAWA`, `VOTO_VALIDO`, `VOTO_BLANCO`, `VOTO_NULO`, `VOTO_EMITIDO`, `VOTO_VALIDO_SISTEMA`, `VOTO_EMITIDO_SISTEMA`) VALUES (NULL, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ? );  ";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idActa);
        statement.setInt(2, presidencia.getCREEMOS());
        statement.setInt(3, presidencia.getADN());
        statement.setInt(4, presidencia.getMASIPSP());
        statement.setInt(5, presidencia.getFPV());
        statement.setInt(6, presidencia.getPANBOL());
        statement.setInt(7, presidencia.getLIBRE21());
        statement.setInt(8, presidencia.getCC());
        statement.setInt(9, presidencia.getJUNTOS());
        statement.setInt(10, presidencia.getAPG());
        statement.setInt(11, presidencia.getCPEM_B());
        statement.setInt(12, presidencia.getCIDOB());
        statement.setInt(13, presidencia.getBIA_YUQUI());
        statement.setInt(14, presidencia.getCONAMAQ());
        statement.setInt(15, presidencia.getOICH());
        statement.setInt(16, presidencia.getORCAWETA());
        statement.setInt(17, presidencia.getYAMINAWA());
        statement.setInt(18, presidencia.getVotosValidos());
        statement.setInt(19, presidencia.getVotoBlanco());
        statement.setInt(20, presidencia.getVotoNulo());
        statement.setInt(21, presidencia.getVotoEmitido());
        statement.setInt(22, presidencia.getVotoValidoSistema());
        statement.setInt(23, presidencia.getVotoEmitidoSistema());
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Nuevo CIR. Especial insertada");
        }
    }
    
    public void insertarObjeto(CandUninominal presidencia, int idActa) throws SQLException {
        String sql = "INSERT INTO `candidaturaUninominal` (`id`, `CODIGO_MESA`, `CREEMOS`, `ADN`, `MAS_IPSP`, `FPV`, `PAN_BOL`, `LIBRE_21`, `CC`, `JUNTOS`, `VOTO_VALIDO`, `VOTO_BLANCO`, `VOTO_NULO`, `VOTO_EMITIDO`, `VOTO_VALIDO_SISTEMA`, `VOTO_EMITIDO_SISTEMA`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idActa);
        statement.setInt(2, presidencia.getCREEMOS());
        statement.setInt(3, presidencia.getADN());
        statement.setInt(4, presidencia.getMASIPSP());
        statement.setInt(5, presidencia.getFPV());
        statement.setInt(6, presidencia.getPANBOL());
        statement.setInt(7, presidencia.getLIBRE21());
        statement.setInt(8, presidencia.getCC());
        statement.setInt(9, presidencia.getJUNTOS());
        statement.setInt(10, presidencia.getVotosValidos());
        statement.setInt(11, presidencia.getVotoBlanco());
        statement.setInt(12, presidencia.getVotoNulo());
        statement.setInt(13, presidencia.getVotoEmitido());
        statement.setInt(14, presidencia.getVotoValidoSistema());
        statement.setInt(15, presidencia.getVotoEmitidoSistema());
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Nuevo Uninominal insertado");
        }
    }
    
    public void actualizar(String id) throws SQLException {
        String sql = "UPDATE publicacion SET perfil=?, perfilURL=?, fechaPost=? WHERE id=?";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "123456789");
        statement.setString(2, "William Henry Bill Gates");
        statement.setString(3, "bill.gates@microsoft.com");
        statement.setString(4, id);
        
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Se actualizo el con exito.");
        }
    }
    
    public void eliminar(String id) throws SQLException {
        String sql = "DELETE FROM publicacion WHERE id=?";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, id);
        
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Se ha eliminado con exito.");
        }
    }

    public Imagenes cargarImagen(Acta acta) throws SQLException {
        Imagenes img = new Imagenes();
        String sql = "SELECT * FROM imagenes WHERE CODIGO_MESA=" + acta.getCodMesa() + "";
        
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
            img.setActa(acta);
            img.setImagenActa(result.getString(2));
            img.setSrcActa(result.getString(3));
            img.setImagenProveido(result.getString(4));
            img.setSrcProveido(result.getString(5));
        }
        return img;
    }

    public void SeleniumCargarImagenes() throws SQLException, InterruptedException {
        Scanner in = new Scanner(System.in);
        Acciones accion = new Acciones();
        accion.abrirConexion();
        accion.irAUnaURL("chrome://settings/downloads");
        String n = in.next();
        accion.irAUnaURL("https://computo.oep.org.bo/");
//
        Acta acta = new Acta();
        Imagenes img= new Imagenes();
        img.setActa(acta);
//
        String sql = "SELECT `CODIGO_MESA` FROM `geografia`  ORDER BY CODIGO_MESA DESC ";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
//
        
        while (result.next() ) {
            acta = cargarActa(result.getInt(1)); //carga acta : result.getInt va iterando
            img = cargarImagen(acta); //carga el registro de la BD por el acta
            img.setActa(acta);
            if(img.esVacia()){
                accion.buscarAca(result.getInt(1));
                img.setImagenActa("SI");
                img.setSrcActa(""+result.getInt(1)+".jpg");
                if(accion.existeProveido()){
                    img.setImagenProveido("SI");
                    img.setSrcProveido(""+result.getInt(1)+"-P.jpg");
                }
                else{
                    img.setImagenProveido("NO");
                    img.setSrcProveido("");
                }
                insertarObjeto(img);
            }
            acta.mostrar();
        }        
        accion.cerrarConexion();
    }

    public Acta cargarActa(int idActa) throws SQLException {
        Acta acta = new Acta();
        if (existeCandUninominalCodMesa(idActa)) {
            if (existeCandEspecialCodMesa(idActa)) {//existe cirEspecial 
                String sql = "SELECT *\n"
                        + "FROM geografia INNER JOIN candidaturaPresidente ON \n"
                        + "geografia.CODIGO_MESA = candidaturaPresidente.CODIGO_MESA \n"
                        + "INNER JOIN candidaturaUninominal ON \n"
                        + "geografia.CODIGO_MESA=candidaturaUninominal.CODIGO_MESA \n"
                        + "INNER JOIN candidaturaEspecial \n"
                        + "ON geografia.CODIGO_MESA=candidaturaUninominal.CODIGO_MESA \n"
                        + "WHERE geografia.CODIGO_MESA=" + idActa + " \n"
                        + "AND candidaturaEspecial.CODIGO_MESA=" + idActa + " ";
                
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);
                
                while (result.next()) {
                    acta.setCodMesa(result.getInt(1));
                    acta.setPais(result.getString(2));
                    acta.setDepartamento(result.getString(3));
                    acta.setProvincia(result.getString(4));
                    acta.setMunicipio(result.getString(5));
                    acta.setLocalidad(result.getString(6));
                    acta.setRecinto(result.getString(7));
                    acta.setNumMesa(result.getInt(8));
                    acta.setNumInscritos(result.getInt(9));
                    acta.getPresidente().setCREEMOS(result.getInt(12));
                    acta.getPresidente().setADN(result.getInt(13));
                    acta.getPresidente().setMASIPSP(result.getInt(14));
                    acta.getPresidente().setFPV(result.getInt(15));
                    acta.getPresidente().setPANBOL(result.getInt(16));
                    acta.getPresidente().setLIBRE21(result.getInt(17));
                    acta.getPresidente().setCC(result.getInt(18));
                    acta.getPresidente().setJUNTOS(result.getInt(19));
                    acta.getPresidente().setVotosValidos(result.getInt(20));
                    acta.getPresidente().setVotoBlanco(result.getInt(21));
                    acta.getPresidente().setVotoNulo(result.getInt(22));
                    acta.getPresidente().setVotoEmitido(result.getInt(23));
                    acta.getPresidente().setVotoValidoSistema(result.getInt(24));
                    acta.getPresidente().setVotoEmitidoSistema(result.getInt(25));
                    acta.getUninominal().setCREEMOS(result.getInt(28));
                    acta.getUninominal().setADN(result.getInt(29));
                    acta.getUninominal().setMASIPSP(result.getInt(30));
                    acta.getUninominal().setFPV(result.getInt(31));
                    acta.getUninominal().setPANBOL(result.getInt(32));
                    acta.getUninominal().setLIBRE21(result.getInt(33));
                    acta.getUninominal().setCC(result.getInt(34));
                    acta.getUninominal().setJUNTOS(result.getInt(35));
                    acta.getUninominal().setVotosValidos(result.getInt(36));
                    acta.getUninominal().setVotoBlanco(result.getInt(37));
                    acta.getUninominal().setVotoNulo(result.getInt(38));
                    acta.getUninominal().setVotoEmitido(result.getInt(39));
                    acta.getUninominal().setVotoValidoSistema(result.getInt(40));
                    acta.getUninominal().setVotoEmitidoSistema(result.getInt(41));
                    acta.getEspecial().setCREEMOS(result.getInt(44));
                    acta.getEspecial().setADN(result.getInt(45));
                    acta.getEspecial().setMASIPSP(result.getInt(46));
                    acta.getEspecial().setFPV(result.getInt(47));
                    acta.getEspecial().setPANBOL(result.getInt(48));
                    acta.getEspecial().setLIBRE21(result.getInt(49));
                    acta.getEspecial().setCC(result.getInt(50));
                    acta.getEspecial().setJUNTOS(result.getInt(51));
                    acta.getEspecial().setAPG(result.getInt(52));
                    acta.getEspecial().setCPEM_B(result.getInt(53));
                    acta.getEspecial().setCIDOB(result.getInt(54));
                    acta.getEspecial().setBIA_YUQUI(result.getInt(55));
                    acta.getEspecial().setCONAMAQ(result.getInt(56));
                    acta.getEspecial().setOICH(result.getInt(57));
                    acta.getEspecial().setORCAWETA(result.getInt(58));
                    acta.getEspecial().setYAMINAWA(result.getInt(59));
                    acta.getEspecial().setVotosValidos(result.getInt(60));
                    acta.getEspecial().setVotoBlanco(result.getInt(61));
                    acta.getEspecial().setVotoNulo(result.getInt(62));
                    acta.getEspecial().setVotoEmitido(result.getInt(63));
                    acta.getEspecial().setVotoValidoSistema(result.getInt(64));
                    acta.getEspecial().setVotoEmitidoSistema(result.getInt(65));
                    
                }
            } else {
                String sql = "SELECT *\n"
                        + "FROM geografia INNER JOIN candidaturaPresidente \n"
                        + "ON geografia.CODIGO_MESA = candidaturaPresidente.CODIGO_MESA \n"
                        + "INNER JOIN candidaturaUninominal \n"
                        + "ON geografia.CODIGO_MESA=candidaturaUninominal.CODIGO_MESA \n"
                        + "WHERE geografia.CODIGO_MESA=" + idActa + "";
                
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);
                
                while (result.next()) {
                    acta.setCodMesa(result.getInt(1));
                    acta.setPais(result.getString(2));
                    acta.setDepartamento(result.getString(3));
                    acta.setProvincia(result.getString(4));
                    acta.setMunicipio(result.getString(5));
                    acta.setLocalidad(result.getString(6));
                    acta.setRecinto(result.getString(7));
                    acta.setNumMesa(result.getInt(8));
                    acta.setNumInscritos(result.getInt(9));
                    acta.getPresidente().setCREEMOS(result.getInt(12));
                    acta.getPresidente().setADN(result.getInt(13));
                    acta.getPresidente().setMASIPSP(result.getInt(14));
                    acta.getPresidente().setFPV(result.getInt(15));
                    acta.getPresidente().setPANBOL(result.getInt(16));
                    acta.getPresidente().setLIBRE21(result.getInt(17));
                    acta.getPresidente().setCC(result.getInt(18));
                    acta.getPresidente().setJUNTOS(result.getInt(19));
                    acta.getPresidente().setVotosValidos(result.getInt(20));
                    acta.getPresidente().setVotoBlanco(result.getInt(21));
                    acta.getPresidente().setVotoNulo(result.getInt(22));
                    acta.getPresidente().setVotoEmitido(result.getInt(23));
                    acta.getPresidente().setVotoValidoSistema(result.getInt(24));
                    acta.getPresidente().setVotoEmitidoSistema(result.getInt(25));
                    acta.getUninominal().setCREEMOS(result.getInt(28));
                    acta.getUninominal().setADN(result.getInt(29));
                    acta.getUninominal().setMASIPSP(result.getInt(30));
                    acta.getUninominal().setFPV(result.getInt(31));
                    acta.getUninominal().setPANBOL(result.getInt(32));
                    acta.getUninominal().setLIBRE21(result.getInt(33));
                    acta.getUninominal().setCC(result.getInt(34));
                    acta.getUninominal().setJUNTOS(result.getInt(35));
                    acta.getUninominal().setVotosValidos(result.getInt(36));
                    acta.getUninominal().setVotoBlanco(result.getInt(37));
                    acta.getUninominal().setVotoNulo(result.getInt(38));
                    acta.getUninominal().setVotoEmitido(result.getInt(39));
                    acta.getUninominal().setVotoValidoSistema(result.getInt(40));
                    acta.getUninominal().setVotoEmitidoSistema(result.getInt(41));
                }
            }
        } else {
            String sql = "SELECT *\n"
                    + "FROM geografia INNER JOIN candidaturaPresidente \n"
                    + "ON geografia.CODIGO_MESA = candidaturaPresidente.CODIGO_MESA \n"
                    + " \n"
                    + "\n"
                    + "WHERE geografia.CODIGO_MESA=" + idActa + "";
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while (result.next()) {
                acta.setCodMesa(result.getInt(1));
                acta.setPais(result.getString(2));
                acta.setDepartamento(result.getString(3));
                acta.setProvincia(result.getString(4));
                acta.setMunicipio(result.getString(5));
                acta.setLocalidad(result.getString(6));
                acta.setRecinto(result.getString(7));
                acta.setNumMesa(result.getInt(8));
                acta.setNumInscritos(result.getInt(9));
                acta.getPresidente().setCREEMOS(result.getInt(12));
                acta.getPresidente().setADN(result.getInt(13));
                acta.getPresidente().setMASIPSP(result.getInt(14));
                acta.getPresidente().setFPV(result.getInt(15));
                acta.getPresidente().setPANBOL(result.getInt(16));
                acta.getPresidente().setLIBRE21(result.getInt(17));
                acta.getPresidente().setCC(result.getInt(18));
                acta.getPresidente().setJUNTOS(result.getInt(19));
                acta.getPresidente().setVotosValidos(result.getInt(20));
                acta.getPresidente().setVotoBlanco(result.getInt(21));
                acta.getPresidente().setVotoNulo(result.getInt(22));
                acta.getPresidente().setVotoEmitido(result.getInt(23));
                acta.getPresidente().setVotoValidoSistema(result.getInt(24));
                acta.getPresidente().setVotoEmitidoSistema(result.getInt(25));
            }
        }
        
        return acta;
    }
    
    public void mostarTodos() throws SQLException {
        String sql = "SELECT * FROM publicacion";
        
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        
        int count = 0;
        
        while (result.next()) {
            String id = result.getString(1);
            String perfil = result.getString(2);
            String perfilURL = result.getString(3);
            String fechaPost = result.getString(4);
            
            String output = "pub #%d: %s - %s - %s - %s";
            System.out.println(String.format(output, ++count, id, perfil, perfilURL, fechaPost));
        }
    }
    
    public boolean existeActa(int codMesa) throws SQLException {
        boolean encontrado = false;
        String sql = ("select * from geografia WHERE CODIGO_MESA=" + codMesa + "");
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
            encontrado = true;
        }
        
        return encontrado;
    }
    
    public boolean existeCandEspecialCodMesa(int codMesa) throws SQLException {
        boolean encontrado = false;
        String sql = ("select * from candidaturaEspecial WHERE CODIGO_MESA=" + codMesa + "");
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
            encontrado = true;
        }
        
        return encontrado;
    }
    
    public boolean existeCandUninominalCodMesa(int codMesa) throws SQLException {
        boolean encontrado = false;
        String sql = ("select * from candidaturaUninominal WHERE CODIGO_MESA=" + codMesa + "");
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
            encontrado = true;
        }
        
        return encontrado;
    }
}

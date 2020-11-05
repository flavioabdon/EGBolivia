/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionfb;

import automatizacionfb.Acta.Acta;
import automatizacionfb.Candidaturas.CandEspecial;
import automatizacionfb.Candidaturas.CandPresidencia;
import automatizacionfb.Candidaturas.CandUninominal;
import bd.conexionACTA;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author arch20
 */
public class Archivos {

    public static void main(String[] args) throws IOException, SQLException {
//      vaciarPresidentesABD();
//        vaciarUninominalBD();
//        vaciarEspecialesBD();
    }

    //fin presidente
    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    public static void vaciarPresidentesABD() throws SQLException, IOException{
        ManejoFichero fich = new ManejoFichero();
        conexionACTA cn= new conexionACTA("localhost");    
//Presidente
        BufferedReader b = fich.obtieneArchivo("presidente.csv");
        String cadena;
        Acta acta = new Acta();
        CandPresidencia presidencia = new CandPresidencia();
        String[] parts;
        while ((cadena = b.readLine()) != null) {
            parts = cadena.split(";");
  
            if (isNumeric(parts[0])) {
                acta.setCodMesa(Integer.parseInt(parts[0]));
                acta.setPais(parts[3]);
                acta.setDepartamento(parts[5]);
                acta.setProvincia(parts[8]);
                acta.setMunicipio(parts[10]);
                acta.setLocalidad(parts[12]);
                acta.setRecinto(parts[14]);
                acta.setNumMesa(Integer.parseInt(parts[15]));
                acta.setNumInscritos(Integer.parseInt(parts[16]));
                presidencia.setCREEMOS(Integer.parseInt(parts[17]));
                presidencia.setADN(Integer.parseInt(parts[18]));
                presidencia.setMASIPSP(Integer.parseInt(parts[19]));
                presidencia.setFPV(Integer.parseInt(parts[20]));
                presidencia.setPANBOL(Integer.parseInt(parts[21]));
                presidencia.setLIBRE21(Integer.parseInt(parts[22]));
                presidencia.setCC(Integer.parseInt(parts[23]));
                presidencia.setJUNTOS(Integer.parseInt(parts[24]));
                presidencia.setVotosValidos(Integer.parseInt(parts[25]));
                presidencia.setVotoBlanco(Integer.parseInt(parts[26]));
                presidencia.setVotoNulo(Integer.parseInt(parts[27]));
                presidencia.setVotoEmitido(Integer.parseInt(parts[28]));
                presidencia.setVotoValidoSistema(Integer.parseInt(parts[29]));
                presidencia.setVotoEmitidoSistema(Integer.parseInt(parts[30]));
                acta.setPresidente(presidencia);
                if (!cn.existeActa(Integer.parseInt(parts[0]))) {
                cn.insertarObjeto(acta);
                cn.insertarObjeto(presidencia, acta.getCodMesa());
                }
                else{
                 cn.insertarObjeto(presidencia, acta.getCodMesa()); 
                }
                acta.mostrar();
            }
            
        }
        b.close();
    }
    public static void vaciarUninominalBD() throws SQLException, IOException{
        ManejoFichero fich = new ManejoFichero();
        conexionACTA cn= new conexionACTA("localhost");    
//Uninominal
        BufferedReader b = fich.obtieneArchivo("uninominal.csv");
        String cadena;
        Acta acta = new Acta();
        CandUninominal presidencia= new CandUninominal();
        String[] parts;
        while ((cadena = b.readLine()) != null) {
            parts = cadena.split(";");
  
            if (isNumeric(parts[0])) {
                acta.setCodMesa(Integer.parseInt(parts[0]));
                acta.setPais(parts[3]);
                acta.setDepartamento(parts[5]);
                acta.setProvincia(parts[8]);
                acta.setMunicipio(parts[10]);
                acta.setLocalidad(parts[12]);
                acta.setRecinto(parts[14]);
                acta.setNumMesa(Integer.parseInt(parts[15]));
                acta.setNumInscritos(Integer.parseInt(parts[16]));
                presidencia.setCREEMOS(Integer.parseInt(parts[17]));
                presidencia.setADN(Integer.parseInt(parts[18]));
                presidencia.setMASIPSP(Integer.parseInt(parts[19]));
                presidencia.setFPV(Integer.parseInt(parts[20]));
                presidencia.setPANBOL(Integer.parseInt(parts[21]));
                presidencia.setLIBRE21(Integer.parseInt(parts[22]));
                presidencia.setCC(Integer.parseInt(parts[23]));
                presidencia.setJUNTOS(Integer.parseInt(parts[24]));
                presidencia.setVotosValidos(Integer.parseInt(parts[25]));
                presidencia.setVotoBlanco(Integer.parseInt(parts[26]));
                presidencia.setVotoNulo(Integer.parseInt(parts[27]));
                presidencia.setVotoEmitido(Integer.parseInt(parts[28]));
                presidencia.setVotoValidoSistema(Integer.parseInt(parts[29]));
                presidencia.setVotoEmitidoSistema(Integer.parseInt(parts[30]));
                acta.setUninominal(presidencia);
                if (!cn.existeActa(Integer.parseInt(parts[0]))) {
                cn.insertarObjeto(acta);
                cn.insertarObjeto(presidencia, acta.getCodMesa());
                }
                else{
                 cn.insertarObjeto(presidencia, acta.getCodMesa()); 
                }
                acta.mostrar();
            }
            
        }
        b.close();
    }
    
    public static void vaciarEspecialesBD() throws SQLException, IOException{
        ManejoFichero fich = new ManejoFichero();
        conexionACTA cn= new conexionACTA("localhost");    
//especial
        BufferedReader b = fich.obtieneArchivo("especial.csv");
        String cadena;
        Acta acta = new Acta();
        CandEspecial presidencia= new CandEspecial();
        String[] parts;
        while ((cadena = b.readLine()) != null) {
            parts = cadena.split(";");
  
            if (isNumeric(parts[0])) {
                acta.setCodMesa(Integer.parseInt(parts[0]));
                acta.setPais(parts[3]);
                acta.setDepartamento(parts[5]);
                acta.setProvincia(parts[8]);
                acta.setMunicipio(parts[10]);
                acta.setLocalidad(parts[12]);
                acta.setRecinto(parts[14]);
                acta.setNumMesa(Integer.parseInt(parts[15]));
                acta.setNumInscritos(Integer.parseInt(parts[16]));
                presidencia.setCREEMOS(Integer.parseInt(parts[17]));
                presidencia.setADN(Integer.parseInt(parts[18]));
                presidencia.setMASIPSP(Integer.parseInt(parts[19]));
                presidencia.setFPV(Integer.parseInt(parts[20]));
                presidencia.setPANBOL(Integer.parseInt(parts[21]));
                presidencia.setLIBRE21(Integer.parseInt(parts[22]));
                presidencia.setCC(Integer.parseInt(parts[23]));
                presidencia.setJUNTOS(Integer.parseInt(parts[24]));
                presidencia.setAPG(Integer.parseInt(parts[25]));
                presidencia.setCPEM_B(Integer.parseInt(parts[26]));
                presidencia.setCIDOB(Integer.parseInt(parts[27]));
                presidencia.setBIA_YUQUI(Integer.parseInt(parts[28]));
                presidencia.setCONAMAQ(Integer.parseInt(parts[29]));
                presidencia.setOICH(Integer.parseInt(parts[30]));
                presidencia.setORCAWETA(Integer.parseInt(parts[31]));
                presidencia.setYAMINAWA(Integer.parseInt(parts[32]));
                presidencia.setVotosValidos(Integer.parseInt(parts[33]));
                presidencia.setVotoBlanco(Integer.parseInt(parts[34]));
                presidencia.setVotoNulo(Integer.parseInt(parts[35]));
                presidencia.setVotoEmitido(Integer.parseInt(parts[36]));
                presidencia.setVotoValidoSistema(Integer.parseInt(parts[37]));
                presidencia.setVotoEmitidoSistema(Integer.parseInt(parts[38]));
                acta.setEspecial(presidencia);
                if (!cn.existeActa(Integer.parseInt(parts[0]))) {
                cn.insertarObjeto(acta);
                cn.insertarObjeto(presidencia, acta.getCodMesa());
                }
                else{
                 cn.insertarObjeto(presidencia, acta.getCodMesa()); 
                }
                acta.mostrar();
            }
            
        }
        b.close();
    }
 
}

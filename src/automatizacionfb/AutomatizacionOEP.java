/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionfb;

import bd.Main;
import bd.conexionACTA;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author archlinux
 */
public class AutomatizacionOEP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, SQLException {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
//        Acciones accion = new Acciones();
//        accion.abrirConexion();
////        accion.irAUnaURL("chrome://settings/downloads");
////        String n = in.next();
////        accion.irAUnaURL("https://computo.oep.org.bo/");
//        accion.buscarAca(2196);
////        accion.irAUnaURL("https://computo.oep.org.bo/");
////        accion.buscarAca(10001);
////        accion.irAUnaURL("https://computo.oep.org.bo/");
////        accion.buscarAca(27061);
//        Thread.sleep(3000);
//       accion.cerrarConexion();
        System.out.println("Introduzca ip servidor mysql");
         String ip=in.next();
         conexionACTA con= new conexionACTA(ip);
         con.SeleniumCargarImagenes();
    }

}

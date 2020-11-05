/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import automatizacionfb.Acta.Acta;
import automatizacionfb.Acta.Imagenes;
import java.sql.SQLException;

/**
 *
 * @author archlinux
 */
public class Main {

    public static void main(String[] args) throws SQLException, InterruptedException {
        
         conexionACTA con= new conexionACTA("1ocalhost");
         con.SeleniumCargarImagenes();
    }
}

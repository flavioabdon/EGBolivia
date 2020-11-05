/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionfb;

import automatizacionfb.Acta.Acta;
import automatizacionfb.Acta.Imagenes;
import bd.conexionACTA;
import java.sql.SQLException;

/**
 *
 * @author arch20
 */
public class Pruebas {

    public static void main(String[] args) throws SQLException {
        Acta acta = new Acta();
        conexionACTA cn = new conexionACTA("localhost");
        acta = cn.cargarActa(1001);
        Imagenes img = cn.cargarImagen(acta);
        img.setActa(acta);
        acta.mostrar();
        img.mostrar();
    }
}

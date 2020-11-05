/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionfb;

/**
 *
 * @author archlinux
 */
public class Login {
    private String usuario;
    private String contrasena;
    private boolean sesionOk;

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSesionOk(boolean sesionOk) {
        this.sesionOk = sesionOk;
    }

    public boolean isSesionOk() {
        return sesionOk;
    }
}

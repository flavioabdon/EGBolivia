/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionfb.Acta;

/**
 *
 * @author arch20
 */
public class Imagenes {
    private Acta acta;
    private String saveActa;
    private String srcActa;
    private String saveProveido;
    private String srcProveido;

    public Imagenes() {
    acta=new Acta();
    saveActa="";
    srcActa="";
    saveProveido="";
    srcProveido="";
    }

    public Imagenes(Acta acta, String saveActa, String srcActa, String saveProveido, String srcProveido) {
        this.acta = acta;
        this.saveActa = saveActa;
        this.srcActa = srcActa;
        this.saveProveido = saveProveido;
        this.srcProveido = srcProveido;
    }


    

    public Acta getActa() {
        return acta;
    }


    public String getSrcActa() {
        return srcActa;
    }

    public String getSrcProveido() {
        return srcProveido;
    }

    public String imagenActaGuardado() {
        return saveActa;
    }

    public String imagenProveidoGuardado() {
        return saveProveido;
    }

    public void setActa(Acta acta) {
        this.acta = acta;
    }

    public void setImagenActa(String saveActa) {
        this.saveActa = saveActa;
    }

    public void setImagenProveido(String imagenProveido) {
        this.saveProveido = imagenProveido;
    }

    public void setSrcActa(String srcActa) {
        this.srcActa = srcActa;
    }

    public void setSrcProveido(String srcProveido) {
        this.srcProveido = srcProveido;
    }
    
    public void mostrar(){
        System.out.println("CodMesa:"+acta.getCodMesa()+""
        + "\nImg Acta Guardado:"+saveActa
                + "\nImg Acta  Ruta:"+srcActa
                + "\nImg Prov. Guardado:"+saveProveido
                + "\nImg Prov. Ruta"+getSrcProveido()
                + "");
    }
    public boolean esVacia(){
        Boolean sw;
        if(getSrcActa()=="" && getSrcProveido()=="" && saveActa=="" && saveProveido==""){
           sw=true; 
        }
        else{
            sw=false;
        }
        return sw;
    }
}

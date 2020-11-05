/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionfb.Acta;

import automatizacionfb.Candidaturas.CandEspecial;
import automatizacionfb.Candidaturas.CandPresidencia;
import automatizacionfb.Candidaturas.CandUninominal;

/**
 *
 * @author arch20
 */
public class Acta {
    private  int codMesa;
    private String pais;
    private String departamento;
    private String provincia;
    private String municipio;
    private String localidad;
    private String recinto;
    private int numMesa;
    private int numInscritos;

//    ;ADN;MAS_IPSP;FPV;PAN_BOL;LIBRE_21;CC;JUNTOS;VOTO_VALIDO;VOTO_BLANCO;VOTO_NULO;VOTO_EMITIDO;VOTO_VALIDO_SISTEMA;VOTO_EMITIDO_SISTEMA
//    ;ADN;MAS_IPSP;FPV;PAN_BOL;LIBRE_21;CC;JUNTOS;VOTO_VALIDO;VOTO_BLANCO;VOTO_NULO;VOTO_EMITIDO;VOTO_VALIDO_SISTEMA;VOTO_EMITIDO_SISTEMA
//    ;ADN;MAS_IPSP;FPV;PAN_BOL;LIBRE_21;CC;JUNTOS;APG;CPEM_B;CIDOB;BIA_YUQUI;CONAMAQ;OICH;ORCAWETA;YAMINAWA;VOTO_VALIDO;VOTO_BLANCO;VOTO_NULO;VOTO_EMITIDO;VOTO_VALIDO_SISTEMA;VOTO_EMITIDO_SISTEMA
    
    private CandPresidencia presidente;
    private CandUninominal uninominal;
    private CandEspecial especial;

    public Acta(int codMesa, String pais, String departamento, String provincia, String municipio, String localidad, String recinto, int numMesa, int numInscritos, CandPresidencia presidente, CandUninominal uninominal, CandEspecial especial) {
        this.codMesa = codMesa;
        this.pais = pais;
        this.departamento = departamento;
        this.provincia = provincia;
        this.municipio = municipio;
        this.localidad = localidad;
        this.recinto = recinto;
        this.numMesa = numMesa;
        this.numInscritos = numInscritos;
        this.presidente = presidente;
        this.uninominal = uninominal;
        this.especial = especial;
    }
    public int getCodMesa() {
        return codMesa;
    }

    public CandEspecial getEspecial() {
        return especial;
    }
    public String getMunicipio() {
        return municipio;
    }

    public int getNumInscritos() {
        return numInscritos;
    }

    public int getNumMesa() {
        return numMesa;
    }


    public CandPresidencia getPresidente() {
        return presidente;
    }
    public CandUninominal getUninominal() {
        return uninominal;
    }

    
    public void setCodMesa(int codMesa) {
        this.codMesa = codMesa;
    }

    public void setEspecial(CandEspecial especial) {
        this.especial = especial;
    }

   

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setNumInscritos(int numInscritos) {
        this.numInscritos = numInscritos;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }


    public void setPresidente(CandPresidencia presidente) {
        this.presidente = presidente;
    }

    public void setUninominal(CandUninominal uninominal) {
        this.uninominal = uninominal;
    }

    
    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRecinto() {
        return recinto;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public Acta() {
        this.codMesa = 0;
        this.pais = null;
        this.departamento=null;
        this.provincia = null;
        this.municipio = null;
        this.localidad = null;
        this.recinto = null;
        this.numMesa = 0;
        this.numInscritos = 0;
        this.presidente = new CandPresidencia();
        this.uninominal = new CandUninominal();
        this.especial = new CandEspecial();
    }
    public void mostrar(){
//        System.out.println("{"+getCodMesa()+":"+getPais().getIdPais()+":"+"}");
System.out.println("{"
        + "\ncodMesa:"+codMesa
        + "\npais:"+pais
        + "\ndepartamento:"+departamento
        + "\nprovincia:"+ provincia
        + "\nmunicipio:"+ ""+municipio
        + "\nlocalidad:"+localidad
        + "\nrecinto:"+recinto
        + "\nnumMesa:"+numMesa
        + "\nnumInscritos:"+numInscritos
        + "}");
        if(this.getPresidente().esVacia()){
            System.out.println("----Columna Presidente Vacia");
        }
        else{
            this.getPresidente().mostrar();
        }
        
        if(this.getUninominal().esVacia()){
            System.out.println("----Columna Uninominal Vacia");
        }
        else{
            this.getUninominal().mostrar();
        }
        
        if(this.getEspecial().esVacia()){
            System.out.println("----Columna Especial Vacia");
        }
        else{
            this.getEspecial().mostrar();
        }
    }
}

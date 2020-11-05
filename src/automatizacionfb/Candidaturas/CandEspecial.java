/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionfb.Candidaturas;

/**
 *
 * @author arch20
 */
public class CandEspecial extends Candidaturas{
   
   private int APG, CPEM_B,CIDOB,BIA_YUQUI,CONAMAQ, OICH, ORCAWETA, YAMINAWA;

    public CandEspecial(int APG, int CPEM_B, int CIDOB, int BIA_YUQUI, int CONAMAQ, int OICH, int ORCAWETA, int YAMINAWA) {
        this.APG = APG;
        this.CPEM_B = CPEM_B;
        this.CIDOB = CIDOB;
        this.BIA_YUQUI = BIA_YUQUI;
        this.CONAMAQ = CONAMAQ;
        this.OICH = OICH;
        this.ORCAWETA = ORCAWETA;
        this.YAMINAWA = YAMINAWA;
    }

    public int getAPG() {
        return APG;
    }

    public int getBIA_YUQUI() {
        return BIA_YUQUI;
    }

    public int getCIDOB() {
        return CIDOB;
    }

    public int getCONAMAQ() {
        return CONAMAQ;
    }

    public int getCPEM_B() {
        return CPEM_B;
    }

    public int getOICH() {
        return OICH;
    }

    public int getORCAWETA() {
        return ORCAWETA;
    }

    public int getYAMINAWA() {
        return YAMINAWA;
    }

    public void setBIA_YUQUI(int BIA_YUQUI) {
        this.BIA_YUQUI = BIA_YUQUI;
    }

    public void setCONAMAQ(int CONAMAQ) {
        this.CONAMAQ = CONAMAQ;
    }

    public void setCIDOB(int CIDOB) {
        this.CIDOB = CIDOB;
    }

    public void setCPEM_B(int CPEM_B) {
        this.CPEM_B = CPEM_B;
    }

    public void setAPG(int APG) {
        this.APG = APG;
    }

    public void setOICH(int OICH) {
        this.OICH = OICH;
    }

    public void setORCAWETA(int ORCAWETA) {
        this.ORCAWETA = ORCAWETA;
    }

    public void setYAMINAWA(int YAMINAWA) {
        this.YAMINAWA = YAMINAWA;
    }
    
    public CandEspecial(int APG, int CPEM_B, int CIDOB, int BIA_YUQUI, int CONAMAQ, int OICH, int ORCAWETA, int YAMINAWA, int CREEMOS, int ADN, int MASIPSP, int FPV, int PANBOL, int LIBRE21, int CC, int JUNTOS, int votosValidos, int votoBlanco, int votoNulo, int votoEmitido, int votoValidoSistema, int votoEmitidoSistema) {
        super(CREEMOS, ADN, MASIPSP, FPV, PANBOL, LIBRE21, CC, JUNTOS, votosValidos, votoBlanco, votoNulo, votoEmitido, votoValidoSistema, votoEmitidoSistema);
        this.APG = APG;
        this.CPEM_B = CPEM_B;
        this.CIDOB = CIDOB;
        this.BIA_YUQUI = BIA_YUQUI;
        this.CONAMAQ = CONAMAQ;
        this.OICH = OICH;
        this.ORCAWETA = ORCAWETA;
        this.YAMINAWA = YAMINAWA;
    }

    public CandEspecial() {
        super();
        this.APG = 0;
        this.CPEM_B = 0;
        this.CIDOB = 0;
        this.BIA_YUQUI = 0;
        this.CONAMAQ = 0;
        this.OICH = 0;
        this.ORCAWETA = 0;
        this.YAMINAWA = 0;
    }

  
    public void mostrar(){
        System.out.println("\n\tEspecial"
                + "\nAPG:"+APG
                + "\nCPEM_B:"+CPEM_B
                + "\nCIDOB:"+CIDOB
                + "\nBIA_YUQUI:"+BIA_YUQUI
                + "\nCONAMAQ:"+CONAMAQ 
                + "\nOICH:"+OICH 
                + "\nORCAWETA:"+ORCAWETA
                + "\nYAMINAWA:"+YAMINAWA
                + "");
        super.mostrar();
        
    }
    
}

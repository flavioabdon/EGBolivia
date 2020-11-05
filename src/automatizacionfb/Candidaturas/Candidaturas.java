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
public class Candidaturas {
    protected int CREEMOS;
    protected int ADN;
    protected int MASIPSP;
    protected int FPV;
    protected int PANBOL;
    protected int LIBRE21;
    protected int CC;
    protected int JUNTOS;
    private int votosValidos, votoBlanco, votoNulo, votoEmitido, votoValidoSistema, votoEmitidoSistema;

    public Candidaturas(int CREEMOS, int ADN, int MASIPSP, int FPV, int PANBOL, int LIBRE21, int CC, int JUNTOS, int votosValidos, int votoBlanco, int votoNulo, int votoEmitido, int votoValidoSistema, int votoEmitidoSistema) {
        this.CREEMOS = CREEMOS;
        this.ADN = ADN;
        this.MASIPSP = MASIPSP;
        this.FPV = FPV;
        this.PANBOL = PANBOL;
        this.LIBRE21 = LIBRE21;
        this.CC = CC;
        this.JUNTOS = JUNTOS;
        this.votosValidos = votosValidos;
        this.votoBlanco = votoBlanco;
        this.votoNulo = votoNulo;
        this.votoEmitido = votoEmitido;
        this.votoValidoSistema = votoValidoSistema;
        this.votoEmitidoSistema = votoEmitidoSistema;
    }

  

    public Candidaturas() {
        this.ADN = 0;
        this.MASIPSP = 0;
        this.FPV = 0;
        this.PANBOL = 0;
        this.LIBRE21 = 0;
        this.CC = 0;
        this.JUNTOS = 0;
        this.votosValidos = 0;
        this.votoBlanco = 0;
        this.votoNulo = 0;
        this.votoEmitido = 0;
        this.votoValidoSistema = 0;
        this.votoEmitidoSistema = 0;
    }
    

    public int getADN() {
        return ADN;
    }

    public int getCC() {
        return CC;
    }

    public int getCREEMOS() {
        return CREEMOS;
    }

    public int getFPV() {
        return FPV;
    }

    public int getJUNTOS() {
        return JUNTOS;
    }

    public int getLIBRE21() {
        return LIBRE21;
    }

    public int getMASIPSP() {
        return MASIPSP;
    }

    public int getPANBOL() {
        return PANBOL;
    }

    public void setADN(int ADN) {
        this.ADN = ADN;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public void setCREEMOS(int CREEMOS) {
        this.CREEMOS = CREEMOS;
    }

    public void setFPV(int FPV) {
        this.FPV = FPV;
    }

    public void setJUNTOS(int JUNTOS) {
        this.JUNTOS = JUNTOS;
    }

    public void setLIBRE21(int LIBRE21) {
        this.LIBRE21 = LIBRE21;
    }

    public void setMASIPSP(int MASIPSP) {
        this.MASIPSP = MASIPSP;
    }

    public void setPANBOL(int PANBOL) {
        this.PANBOL = PANBOL;
    }

   

    public int getVotosValidos() {
        return votosValidos;
    }

    public void setVotosValidos(int votosValidos) {
        this.votosValidos = votosValidos;
    }

    public int getVotoBlanco() {
        return votoBlanco;
    }

    public int getVotoEmitido() {
        return votoEmitido;
    }

    public int getVotoEmitidoSistema() {
        return votoEmitidoSistema;
    }

    public int getVotoNulo() {
        return votoNulo;
    }

    public int getVotoValidoSistema() {
        return votoValidoSistema;
    }

    public void setVotoBlanco(int votoBlanco) {
        this.votoBlanco = votoBlanco;
    }

    public void setVotoEmitido(int votoEmitido) {
        this.votoEmitido = votoEmitido;
    }

    public void setVotoEmitidoSistema(int votoEmitidoSistema) {
        this.votoEmitidoSistema = votoEmitidoSistema;
    }

    public void setVotoNulo(int votoNulo) {
        this.votoNulo = votoNulo;
    }

    public void setVotoValidoSistema(int votoValidoSistema) {
        this.votoValidoSistema = votoValidoSistema;
    }
    
    public void mostrar(){
//nt , int , int , int , int  int , int , int , int , int 
        System.out.println(""
                + "CREEMOS:"+CREEMOS
                + "\nADN:"+ADN
                + "\nMASIPSP:"+MASIPSP
                + "\nFPV:"+FPV
                + "\nPANBOL:"+PANBOL
                + "\nLIBRE21:"+LIBRE21
                + "\nCC:"+CC
                + "\nJUNTOS:"+JUNTOS
                + "\nvotosValidos:"+votosValidos
                        + "\nvotoBlanco:"+votoBlanco
                        + "\nvotoNulo:"+votoNulo
                        + "\nvotoEmitido:"+votoEmitido
                        + "\nvotoValidoSistema:"+votoValidoSistema
                        + "\nvotoEmitidoSistema:"+votoEmitidoSistema
                        + "");
    }
    public boolean esVacia(){
        boolean ret=false;
        if(getVotoBlanco()==0 && getVotoEmitido()==0 && getVotosValidos()==0 && getVotoEmitidoSistema()==0 && getVotoValidoSistema()==0){
            ret=true;
        }
        else{
            ret=false;
        }
        return ret;
    }
}

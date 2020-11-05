package automatizacionfb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoFichero {

    public ManejoFichero() {
    }

    public void escribir (String texto, String nombreArch) throws IOException{
         String ruta = "./arch/"+nombreArch+"";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(texto);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(texto);
        }
        bw.close();
    }
      void muestraContenido(String nombreArch) throws FileNotFoundException, IOException {
      String ruta = "./arch/"+nombreArch+"";
      File archivo = new File(ruta);
      String cadena;
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          System.out.println(cadena);
      }
      b.close();
}
      BufferedReader obtieneArchivo(String nombreArch) throws FileNotFoundException, IOException {
      String ruta = "./arch/"+nombreArch+"";
      File archivo = new File(ruta);
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);

      return b;
}
      
 
    public boolean  existeEscribir (String nombreArch) throws IOException{
        boolean ret= false;
        String ruta = "./arch/"+nombreArch+"";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            ret=true;
        } else {
            ret=false;
        }
        return ret;
    }
}
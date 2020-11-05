package automatizacionfb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author archlinux
 */
public class Acciones {

    ChromeDriver driver;
    ChromeOptions chromeOptions = new ChromeOptions();

    public Acciones() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        chromeOptions.addArguments("--headless", "--disable-gpu", "--blink-settings=imagesEnabled=true");
        driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver(chromeOptions);
    }

    public boolean abrirConexion() throws InterruptedException {
        boolean isOk = false;
        driver.get("https://computo.oep.org.bo/");
        Thread.sleep(500);

        return isOk;
    }

    public void buscarAca(int codMesa) throws InterruptedException {
        String xpathBotonActa= "//span[contains(text(),'ACTAS')]";
        do {            
        } while (!existeElemento(xpathBotonActa) || !sePuedeHacerClickElemento(xpathBotonActa));
//        WebElement botonActa = driver.findElement(By.xpath(xpathBotonActa));
//        botonActa.click();
        
        String xpathRadioButton= "//body[1]/app-root[1]/div[1]/div[1]/div[2]/div[1]/app-principal[1]/div[3]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/app-acta[1]/div[1]/div[1]/form[1]/mat-radio-group[1]/div[1]/div[3]/mat-radio-button[1]/label[1]/div[2]";
        do {            
        } while (!existeElemento(xpathRadioButton) || !sePuedeHacerClickElemento(xpathRadioButton));
//        WebElement radioButton = driver.findElement(By.xpath(xpathRadioButton));
//        radioButton.click();
        
        String xpathCajaBuscarMesa="//input[@id='mat-input-0']";
        do {            
        } while (!existeElemento(xpathBotonActa));
        WebElement cajaBuscarMesa = driver.findElement(By.xpath(xpathCajaBuscarMesa));
        cajaBuscarMesa.clear();
        cajaBuscarMesa.sendKeys("" + codMesa);
        WebElement buttonBuscar = driver.findElement(By.xpath("//span[contains(text(),'BUSCAR')]"));
        buttonBuscar.click();
        
        String xpathbtnDesActa="//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/app-principal[1]/div[3]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/app-acta[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/dx-toolbar[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/i[1]";
        do {            
        } while (!existeElemento(xpathbtnDesActa) || !sePuedeHacerClickElemento(xpathbtnDesActa));
//        WebElement btnDesActa= driver.findElement(By.xpath(xpathbtnDesActa));
//        btnDesActa.click();
        //
        if (existeProveido()) {
            WebElement btnProveido = driver.findElement(By.xpath("//span[contains(text(),'PROVEÍDO')]"));
            btnProveido.click();
            String xpathbtnDesProveido="//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/app-principal[1]/div[3]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/app-acta[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/dx-toolbar[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/i[1]";
            do {                
            } while (!existeElemento(xpathbtnDesProveido) || !sePuedeHacerClickElemento(xpathbtnDesProveido));
//            WebElement btnDesProveido= driver.findElement(By.xpath(xpathbtnDesProveido));
//            btnDesProveido.click();
            System.out.println("Tiene proveido CodMesa:" + codMesa);
        } else {
            System.out.println("No tiene proveido CodMesa:" + codMesa);
        }
    }

    public void irAUnaURL(String url) {
        driver.get(url);
    }

    public void cerrarConexion() {
        driver.close();
        driver.quit();
    }

    public boolean existeProveido() throws InterruptedException {
        boolean present = false;
        try {
            driver.findElement(By.xpath("//span[contains(text(),'PROVEÍDO')]"));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        catch(ElementNotInteractableException e){
            present=false;
            Thread.sleep(100);
            System.out.println("++++++Exepcion: Elemento no interactuable"+e+",xpath");
        }
        catch (ElementNotSelectableException e){
            present= false;
            Thread.sleep(100);
            System.out.println("++++++Exepcion"+e+",xpath");
        }
           catch (WebDriverException e){
            present=false;
            Thread.sleep(5000);
            System.out.println("++++++Exepcion ERROR DE WEBDRIVER!!!!!!!!!!!!!!!!!!"+e+",xpath");
        }
        return present;
    }
    public boolean existeElemento(String xpath) throws InterruptedException{
        boolean sw=false;
        try{
            driver.findElement(By.xpath(xpath));
            sw=true;
        }catch(NoSuchElementException e){
            sw=false;
            Thread.sleep(100);
            System.out.println("-----Exepcion: No existe elemento:Esperando 5 seg"+e+",xpath");
        }
                catch(ElementNotInteractableException e){
            sw=false;
            Thread.sleep(100);
            System.out.println("++++++Exepcion: Elemento no interactuable"+e+",xpath");
        }
        catch (ElementNotSelectableException e){
            Thread.sleep(100);
            System.out.println("++++++Exepcion"+e+",xpath");
        }
           catch (WebDriverException e){
            sw=false;
            Thread.sleep(5000);
            System.out.println("++++++Exepcion ERROR DE WEBDRIVER!!!!!!!!!!!!!!!!!!"+e+",xpath");
        }
        return sw;
    }
    public boolean sePuedeHacerClickElemento(String xpath) throws InterruptedException{
        boolean sw = false;
        try{
            driver.findElement(By.xpath(xpath)).click();
            sw=true;
        }
        catch(ElementClickInterceptedException e){
            sw=false;
            Thread.sleep(100);
            System.out.println("++++++Exepcion: No se puede hacer click:Esperando 5 seg"+e+",xpath");
        }
        catch(ElementNotInteractableException e){
            sw=false;
            Thread.sleep(100);
            System.out.println("++++++Exepcion: Elemento no interactuable"+e+",xpath");
        }
        catch (ElementNotSelectableException e){
            sw=false;
            Thread.sleep(100);
            System.out.println("++++++Exepcion"+e+",xpath");
        }
        catch (WebDriverException e){
            sw=false;
            Thread.sleep(5000);
            System.out.println("++++++Exepcion ERROR DE WEBDRIVER!!!!!!!!!!!!!!!!!!"+e+",xpath");
        }
        return sw;
    }
}

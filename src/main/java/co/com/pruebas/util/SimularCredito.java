package co.com.pruebas.util;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class SimuladorCredito extends PageObject{
    static String targetElementName;
    public static final Target BOTON_SIMULADOR = Target.the(targetElementName : "boton simular crédito").located(By.xpath("//*[@id="tab-categoria-vehiculo"]"));

}
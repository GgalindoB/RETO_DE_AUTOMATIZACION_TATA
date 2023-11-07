package co.com.pruebas.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bancolombia.com/personas")
public class BancolombiaHome extends PageObject{
    static String targetElementName;
    public static final Target BOTON_SABERMAS = Target.the(targetElementName : "boton saber mas").located(By.xpath("//*[@id="home-conoce-mas-productos"]/div/div[2]/div[1]/div/div[2]/span"));

}
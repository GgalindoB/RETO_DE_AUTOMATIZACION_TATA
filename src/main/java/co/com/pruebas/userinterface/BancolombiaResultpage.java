package co.com.pruebas.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.pruebas.userinterface.BancolombiaHome.targetElementName;

public class BancolombiaResultpage {
   public static final Target LABEL_CREDITOS = Target.the(targetElementName: "Campo de texto de busqueda").located(By.xpath("//*[@id="dy-wcm-btti-ac2cf362"]/div/div/div/div/div[1]/div/h1"));
}

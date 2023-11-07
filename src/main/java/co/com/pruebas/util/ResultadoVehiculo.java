package co.com.pruebas.util;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.pruebas.userinterface.BancolombiaHome.targetElementName;

public class ResultadoVehiculo {
    public static final Target LABEL_ALTOCILINDRAJE = Target.the(targetElementName: "Campo de texto de busqueda moto alto cilindraje").located(By.xpath("//*[@id="creditos"]/div/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/h5"));
}
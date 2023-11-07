package co.com.pruebas.Tasks;

import co.com.pruebas.userinterface.BancolombiaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class MainPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(BancolombiaHome.BOTON_SABERMAS));
    }

}

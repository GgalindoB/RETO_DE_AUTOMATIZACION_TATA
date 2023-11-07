package co.com.pruebas.Tasks;

import co.com.pruebas.userinterface.BancolombiaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

@DefaultUrl("https://www.bancolombia.com/personas")
public class HomePage implements Task {
    private BancolombiaHome bancolombiaHome;
    public static HomePage paginabancolombia(){return Tasks.instrumented(HomePage.class);}
    @Override
    public <T extends Actor> void performAs(T actor){actor.attemptsTo(Open.browserOn(BancolombiaHome));}

}

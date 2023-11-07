package co.com.pruebas.Questions;

import co.com.pruebas.userinterface.BancolombiaResultpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
i
public class Respuesta implements Question<String>{
    public static Respuesta es(){return new Respuesta();}
    @Override
    public String answeredBy (Actor actor){
        return Text.of(BancolombiaResultpage.LABEL_CREDITOS).viewedBy(actor).asString();
    }
}
package co.com.pruebas.Interaction;
import co.com.pruebas.Tasks.MainPage;
import org.fluentlenium.core.annotation.Page;
import net.serenitybdd.core.pages.PageObject;

public class MainPageInteraction extends PageObject{

    @Page
    private MainPage mainPage;

    public String getTitleMainPage() {
        return mainPage.txtTitleMainPage.waitUntilVisible().getText();
    }

}
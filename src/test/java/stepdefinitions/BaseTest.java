package stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.SystemEnvironmentVariables;
import utils.WordsReserved;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BaseTest {

    public static String actor = "user";

    public BaseTest(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(actor).whoCan(CallAnApi.at(SystemEnvironmentVariables.createEnvironmentVariables().getProperty(WordsReserved.URL_BASE.getText())));
    }

}

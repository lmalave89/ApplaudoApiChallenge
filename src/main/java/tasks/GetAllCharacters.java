package tasks;

import exceptions.GetExceptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import utils.StatusCode;
import utils.uris.Characters;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetAllCharacters implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Get.resource(Characters.URI_GET_ALL_CHARACTERS.getURI()));
            actor.should(seeThatResponse("Service Get all characters executed success",
                    response -> response.statusCode(StatusCode.CODE_200.getCode())));
        }catch(Exception e){
            new GetExceptions(GetExceptions.FAILED_REFERENCE, e);
        }
    }

    public static GetAllCharacters execute() {
        return Tasks.instrumented(GetAllCharacters.class);
    }

}

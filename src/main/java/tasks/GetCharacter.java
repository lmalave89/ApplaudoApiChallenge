package tasks;

import exceptions.GetExceptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import utils.StatusCode;
import utils.uris.Characters;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetCharacter implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(Get.resource(java.net.URLDecoder.decode(Characters.URI_GET_USER_BY_CHARACTER.getURI(), "UTF-8")));
            actor.should(seeThatResponse("Service get character executed success",
                    response -> response.statusCode(StatusCode.CODE_200.getCode())));
        }catch(Exception e){
            new GetExceptions(GetExceptions.FAILED_REFERENCE, e);
        }
    }

    public static GetCharacter execute() {
        return Tasks.instrumented(GetCharacter.class);
    }
}

package tasks;

import exceptions.GetExceptions;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import utils.POJO.CharactersPOJO;

import java.util.List;


public class PrintInformationCharacters implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            List<CharactersPOJO> characters = SerenityRest.lastResponse().jsonPath().getList("", CharactersPOJO.class);
            for (CharactersPOJO character: characters) {
                System.out.println("Character name: \"" + character.getName() + "\"");
                System.out.println("Portrayed: \"" + character.getPortrayed() + "\"");
                System.out.println("---------------------------");
            }
        }catch(Exception e){
            new GetExceptions(GetExceptions.FAILED_REFERENCE, e);
        }
    }

    public static PrintInformationCharacters execute() {
        return Tasks.instrumented(PrintInformationCharacters.class);
    }
}

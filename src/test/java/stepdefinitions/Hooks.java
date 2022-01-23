package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest{

    public Hooks(){}

    @After
    public void close(Scenario scenario){
        if (scenario.isFailed()) {
            System.out.println("Scenario Failed");
        }else{
            System.out.println("Scenario Success");
        }
    }

}
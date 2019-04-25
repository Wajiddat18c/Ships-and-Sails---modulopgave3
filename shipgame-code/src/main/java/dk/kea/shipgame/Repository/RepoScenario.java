package dk.kea.shipgame.Repository;

import dk.kea.shipgame.Model.ScenarioSingleton;
import org.springframework.stereotype.Repository;

@Repository
public class RepoScenario {

    public ScenarioSingleton getScenario(){

        //Hardcoded scenarioSingleton - skal hentes fra DB
        ScenarioSingleton scenarioSingleton = ScenarioSingleton.getInstance();
        scenarioSingleton.setSizeX(24);
        scenarioSingleton.setSizeY(24);

        return scenarioSingleton;
    }
}

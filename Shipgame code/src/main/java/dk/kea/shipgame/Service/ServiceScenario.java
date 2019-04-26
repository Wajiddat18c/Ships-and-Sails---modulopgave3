package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.ScenarioSingleton;
import dk.kea.shipgame.Repository.RepoScenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceScenario {

    @Autowired
    RepoScenario repoScenario;
    public ScenarioSingleton createScenario(){
        return repoScenario.getScenario();
    }
}

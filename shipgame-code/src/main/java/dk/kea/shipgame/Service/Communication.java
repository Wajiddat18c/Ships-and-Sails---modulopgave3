package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Order;
import dk.kea.shipgame.Model.Ship;
import dk.kea.shipgame.Model.Weather;

import java.util.List;

public class Communication implements ICommunication {
    @Override
    public boolean initComm(String ip) {
        return false;
    }

    @Override
    public void exchangeWeather(Weather weather) {

    }

    @Override
    public void exchangeOrders(List<Ship> ships, List<Order> orders) {

    }

    @Override
    public void exchangeAttackResolved(List<Ship> ships) {

    }
}

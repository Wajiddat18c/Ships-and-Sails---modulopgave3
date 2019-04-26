package dk.kea.shipgame.Model;

import dk.kea.shipgame.Service.ICommunication;

import java.util.List;

public class Communication implements ICommunication {

    Connection connection;
    String ip;

    public Communication(){

    }


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

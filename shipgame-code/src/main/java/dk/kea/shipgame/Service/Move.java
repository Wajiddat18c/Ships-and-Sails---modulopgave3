package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Coordinate;
import dk.kea.shipgame.Model.Order;
import dk.kea.shipgame.Model.Ship;
import dk.kea.shipgame.Model.Weather;

import java.util.List;

public class Move implements IMove {

    List<Ship> ships;
    List<Order> orders;
    Weather weather;

    public Move(){}

    @Override
    public void movement(List<Ship> ships, List<Order> orders, Weather weather) {
        this.ships = ships;
        this.orders = orders;
        this.weather = weather;
        moveShips();
        chkForCollision();
    }
    private void moveShips(){

        //flyt skibe ud fra ordre.
        for(Ship ship : ships){
            int shipid = ship.getShipId();
            for(Order order : orders){
                if(shipid == order.getShipId()){
                    //List<Coordinate> indeholder fra(0) og til(1) koordinater
                    List<Coordinate> coordinates = order.getCoordinateList();
                    Coordinate toCoordinate = coordinates.get(1);
                    ship.setCoordinate("" + toCoordinate.getX() + toCoordinate.getY());
                }
            }

        }
    }
    private void chkForCollision(){

        //check om skibe står på samme felt.
        for(Ship ship : ships){

            for(Ship ship2 : ships){

                //hvis skibet har samme koordinat og ikke er sig selv.
                if(ship.getCoordinate() == ship2.getCoordinate() && ship.getShipId() != ship2.getShipId()){

                    //do collision damage.

                }

            }

        }

    }
}

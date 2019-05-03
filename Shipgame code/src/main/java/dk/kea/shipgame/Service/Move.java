package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.*;
import dk.kea.shipgame.Model.Weather;

import java.util.Arrays;
import java.util.List;

import static dk.kea.shipgame.Model.Direction.N;

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
                    //mangler beregnign på wind.
                    List<Coordinate> coordinates = order.getCoordinateList();


                }
            }
        }

    }
    private int determineShipSpeed(int currentShipSpeed, String currentShipDirection, Direction direction){
        String windDirection = direction.toString();
            if(currentShipDirection.equals("N")){
                if(windDirection.equals("S")){
                    return 0; //Speed = 0;
                }
                else if(windDirection.equals("SW") || windDirection.equals("SE")){
                    return currentShipSpeed - 2;
                }
            }
            else if(currentShipDirection.equals("NE")){
                if(windDirection.equals("SW")){
                    return 0; //speed = 0;
                }
                else if(windDirection.equals("NW") || windDirection.equals("S")){
                    return currentShipSpeed - 2;
                }
            }

            else if(currentShipDirection.equals("SE")){
                if(windDirection.equals("NW")){
                    return 0; //speed = 0;
                }
                else if(windDirection.equals("N") || windDirection.equals("SW")){
                    return currentShipSpeed - 2;
                }

            }

            else if(currentShipDirection.equals("S")){
                if(windDirection.equals("N")){
                    return 0; // speed = 0;
                }
                else if(windDirection.equals("NW") || windDirection.equals("NE")){
                    return currentShipSpeed - 2;
                }
                else {
                    return currentShipSpeed;
                }
            }

            else if(currentShipDirection.equals("SW")){
                if(windDirection.equals("NE")){
                    return 0;
                }
                else if(windDirection.equals("N") || windDirection.equals("SE")){
                    return currentShipSpeed - 2;
                }
            }
            else if(currentShipDirection.equals("NW")){
                if(windDirection.equals("SE")){
                    return 0;
                }
                else if(windDirection.equals("S") || windDirection.equals("NE")){
                    return currentShipSpeed - 2;
                }
            }
        return currentShipSpeed; // full speed;

        }

    /**
     *
     * @param
     */
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

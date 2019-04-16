package dk.kea.shipgame.Model;

import dk.kea.shipgame.Service.IMove;
import dk.kea.shipgame.Model.Ship;
import javafx.scene.control.skin.TextInputControlSkin;

import java.awt.*;
import java.util.List;
import java.util.WeakHashMap;

public class Movement implements IMove{
    private int xPos;
    private int yPos;
    private boolean updateShipsSingleton;
    private String Weather;
    private int determineSpeed;
    private int determineMoveLength;
    private String shipType;
    private Direction Direction;



    public Movement()
    {
        xPos = 0;               //initial x position
        yPos = 0;               //initial y position

    }

    public boolean updateShipsSingleton(){
        if(true){
            return updateShipsSingleton;
        }
        else{
            System.out.println("Kan ikke opdaterer");
        }
        return false;

    }

    public String getWeather (Direction windDirection, int windSpeed){
        return Weather;
    }



    public int determineSpeed(String shipType, int speed, double sail_health, int sailors){
        if(shipType.equals("Brig")){
            sail_health = 30;
            sailors = 6;
            speed = 2;
            return speed;

        }
        else if(shipType.equals("Brig") && sailors <= 0.50){
            speed = 1;
            return speed;

        }

        else if (shipType.equals("Brig") && sailors <= 0.25){
            speed = 1;
            return speed;

        }

        else if(shipType.equals("Brig") && sailors <= 0.10){
            speed = 1;
            return speed;

        }

        else if(shipType.equals("Brig") && sailors <= 0.0){
            speed = 0;
            return speed;
        }

        if(shipType.equals("Ship of the Line")){
            sail_health = 60;
            sailors = 6;
            speed = 5;
            return speed;
        }
        else if(shipType.equals("Ship of the Line") && sailors <= 0.50){
            speed = 3;
            return speed;

        }
        else if(shipType.equals("Ship of the Line") && sailors <= 0.25){
            speed = 2;
            return speed;

        }
        else if(shipType.equals("Ship of the Line") && sailors <= 0.10){
            speed = 1;
            return speed;

        }
        else if(shipType.equals("Ship of the Line") && sailors <= 0.00){
            speed = 0;
            return speed;

        }

        if (shipType.equals("Man at War")){
            sail_health = 80;
            sailors = 6;
            speed = 4;
            return speed;

        }
        else if(shipType.equals("Man at War") && sailors <= 0.50){
            speed = 3;
            return speed;

        }
        else if(shipType.equals("Man at War") && sailors <= 0.25){
            speed = 2;
            return speed;

        }
        else if(shipType.equals("Man at War") && sailors <= 0.10){
            speed = 1;
            return speed;

        }
        else if(shipType.equals("Man at War") && sailors <= 0.00){
            speed = 0;
            return speed;

        }
        return speed;
    }

    public int determineMoveLength(){
    this.determineMoveLength = determineMoveLength;
    return determineMoveLength;

    }

    public int getDetermineMoveLength() {
        return determineMoveLength;
    }

    public Direction getDirection(){
        return Direction;
    }


    public void setDirection(){
        this.Direction = Direction;
    }


    public Point getNewPoisitionXY(){
        return new Point(xPos, yPos);
    }

    public void setNewPositionXY(int x, int y){
        xPos = x;           //updated x position of the ship
        yPos = y;           //updated y position of the ship

    }

    @Override
    public void movement(List<Ship> ships, List<Order> orders, Weather weather) {
            System.out.print(("Here is your list of ships:" + ships));
            System.out.print("Current orders:" + orders);
            System.out.print("Weather:" + weather);
        }

}



package dk.kea.shipgame.Model;

public class Ship {

    private int shipId;
    private String shipType;
    private String nationality;
    private String name;
    private String coordinate;
    private String direction; //ENUM, N, NE, SE, S, SW, NW
    private int speed; //change: speed last round +/- calculated change
    private int hull_health; //0 - 100%
    private int sail_health; //0 - 100%
    private int sailors; //0 - MAX_SAILORS
    private int load; //load time
    private int currentAmmunitionType; //0=canonball, 1=chainball, 2=grapeshot

    public Ship() {
    }

    public Ship(int shipId, String shipType, String nationality, String name, String coordinate, String direction, int speed, int hull_health, int sail_health, int sailors, int load, int currentAmmunitionType) {
        this.shipId = shipId;
        this.shipType = shipType;
        this.nationality = nationality;
        this.name = name;
        this.coordinate = coordinate;
        this.direction = direction;
        this.speed = speed;
        this.hull_health = hull_health;
        this.sail_health = sail_health;
        this.sailors = sailors;
        this.load = load;
        this.currentAmmunitionType = currentAmmunitionType;
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHull_health() {
        return hull_health;
    }

    public void setHull_health(int hull_health) {
        this.hull_health = hull_health;
    }

    public int getSail_health() {
        return sail_health;
    }

    public void setSail_health(int sail_health) {
        this.sail_health = sail_health;
    }

    public int getSailors() {
        return sailors;
    }

    public void setSailors(int sailors) {
        this.sailors = sailors;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getCurrentAmmunitionType() {
        return currentAmmunitionType;
    }

    public void setCurrentAmmunitionType(int currentAmmunitionType) {
        this.currentAmmunitionType = currentAmmunitionType;
    }
}

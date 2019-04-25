package dk.kea.shipgame.Model;

public class ScenarioSingleton {

    private static ScenarioSingleton instance;
    private static int sizeX;
    private static int sizeY;


    private ScenarioSingleton(){
    }

    public static ScenarioSingleton getInstance(){
        if(instance == null){
            instance = new ScenarioSingleton();
        }
        return instance;
    }

    public static int getSizeX() {
        return sizeX;
    }

    public static void setSizeX(int sizeX) {
        ScenarioSingleton.sizeX = sizeX;
    }

    public static int getSizeY() {
        return sizeY;
    }

    public static void setSizeY(int sizeY) {
        ScenarioSingleton.sizeY = sizeY;
    }

    @Override
    public String toString() {
        return "ScenarioSingleton{" +
                "sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                '}';
    }
}

package dk.kea.shipgame.Model;

public class MyImage {

    int id;
    String name;
    int top;
    int left;

    public MyImage() {
    }

    public MyImage(int id, String name, int top, int left) {
        this.id = id;
        this.name = name;
        this.top = top;
        this.left = left;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }
}

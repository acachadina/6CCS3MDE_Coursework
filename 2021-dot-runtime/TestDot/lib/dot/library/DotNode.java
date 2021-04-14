package dot.library;

import java.awt.*;


public class DotNode
{
    private String name;
    private boolean drawn = false;      //whether it has been drawn in the graph or not
    private int x,y = 0;
    private Attributes attributes = new Attributes();

    public DotNode(String name){
        this.name = name;
    }

    public DotNode(String name, Attributes attributes){
        this.name = name;
        this.attributes = attributes;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Color getColor(){
        return attributes.getColor();
    }

    public String getLabel(){
        return attributes.getLabel();
    }
}

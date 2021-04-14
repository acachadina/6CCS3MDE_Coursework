package dot.library;

import java.awt.*;


public class DotNode
{
    private String name;
    private boolean connected = false;      //whether it is connected to an edge
    private int x,y = 0;
    private Attributes attributes = new Attributes();

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

    public Color getFillColor(){
        return attributes.getFillColor();
    }
    
    public Color getLineColor(){
        return attributes.getLineColor();
    }

    public String getLabel(){
        return attributes.getLabel();
    }
    
    public String getName(){
        return name;
    }
    
    public void setConnected() {
    	connected = true;
    }

	public boolean isConnected() {
		return connected;
	}
}

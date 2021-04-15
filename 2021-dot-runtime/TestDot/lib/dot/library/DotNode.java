package dot.library;

import java.awt.*;

/**
 * Class to represent a node from a DotGraph.
 *
 */
public class DotNode
{
    private String name;    
    private boolean connected = false;   				// True if connected to an edge   
    private int x,y = 0;								// Coordinates of the node
    private Attributes attributes = new Attributes();	// Attributes of the node

    
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
    
    public boolean isConnected() {
		return connected;
	}
    
    public void setConnected() {
    	connected = true;
    }
    
    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }	
}

package dot.library;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

/**
 * Class representing the attribute of a DotNode. 
 *
 */
public class Attributes{
	
    private Color lineColor = new Color(0,0,0);
    private String label = null;
    private Color fillColor = new Color(255,255,255);


    /**
     * Constructor. Given a HashMap of attributes of the type 
     * <attributeName, attributeValue> define the ones specified.
     * @param attributes 
     */
    public Attributes(HashMap<String, String> attributes){
    	for(String attribute : attributes.keySet()) {
    		switch(attribute) {
	    		case "fillColor" : {
	    			fillColor = toColor(attributes.get(attribute));
	    			break;
	    		}
	    		case "label" : {
	    			label = attributes.get(attribute);
	    			break;
	    		}
	    		case "lineColor" : {
	    			lineColor = toColor(attributes.get(attribute));
	    			break;
	    		}
    		}
    	}
    }
    
    /**
     * Default constructor. Keeps attributes with their default values. 
     */
    public Attributes(){}
    
    /**
     * Given a string representing a color, return a Color object if valid, 
     * or and instance of Color representing white as default.
     * @param colorString : String for the color to return 
     * @return Color
     */
    public Color toColor(String colorString) {
    	try {
    	    Field field = Class.forName("java.awt.Color").getField(colorString);
    	    return (Color)field.get(null);
    	} catch (Exception e) {
    		return new Color(255,255,255); 
    	}
    }

    public Color getFillColor(){
        return fillColor;
    }

    public String getLabel(){
        return label;
    }

	public Color getLineColor() {
		return lineColor;
	}
}

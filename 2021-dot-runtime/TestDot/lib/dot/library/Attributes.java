package dot.library;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

public class Attributes{

    private Color color;
    private String label;


    public Attributes(HashMap<String, String> attributes){
        //TODO: parse string
        // optionalAttributes.attr.attributeName // attributeValue
        //TODO: Specify default values
    	
    	for(String attribute : attributes.keySet()) {
    		switch(attribute) {
    		case "color" : {
    			color = toColor(attributes.get(attribute));
    			break;
    		}
    		case "label" : {
    			label = attributes.get(attribute);
    			break;
    		}
    }
    	}

    }

    public Attributes(){
    	//default 
    	color = new Color(255,255,255);
    	label = null;
    }
    
    public Color toColor(String colorString) {
    	try {
    	    Field field = Class.forName("java.awt.Color").getField(colorString);
    	    return (Color)field.get(null);
    	} catch (Exception e) {
    		return new Color(255,255,255); 
    	}
    }

    public Color getColor(){
        return color;
    }

    public String getLabel(){
        return label;
    }


}

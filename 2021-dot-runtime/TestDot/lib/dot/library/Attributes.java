package dot.library;

import java.awt.*;
import java.util.List;

public class Attributes{

    private Color color = new Color(0,0,0);
    private String label = "";


    public Attributes(List<String> attributes){
        //TODO: parse string
        // optionalAttributes.attr.attributeName // attributeValue
        //TODO: Specify default values

    }

    public Attributes(){

    }

    public Color getColor(){
        return color;
    }

    public String getLabel(){
        return label;
    }


}

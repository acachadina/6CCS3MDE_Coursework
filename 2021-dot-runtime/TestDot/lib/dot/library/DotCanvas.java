package dot.library;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Custom class extending JPanel that represents the canvas
 * for Dot Graphs.
 * 
 */
public class DotCanvas extends JPanel
{
	
    private List<DotGraph> graphs = new ArrayList<>();
    private int width;
    private int height;

    public DotCanvas(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (DotGraph graph: graphs) {
            graph.create(g, width, height);
        }
    }

    public void add(DotGraph dg) {
        graphs.add(dg);
        this.repaint();
    }
}

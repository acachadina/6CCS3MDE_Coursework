package dot.library;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class DotFrame extends JFrame {
    private DotCanvas canvas = new DotCanvas(400, 400);

    public DotFrame() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        init();

        setTitle("Dot Graph");

        pack();
        setSize(400, 400);
        setVisible(true);
    }

    private void init(){
        setLayout(new BorderLayout());
        add(canvas, BorderLayout.CENTER);
    }

    public void addGraphs(HashMap<String, DotGraph> graphs) {
        for(DotGraph graph : graphs.values()) {
            canvas.add(graph);
        }
    }
}


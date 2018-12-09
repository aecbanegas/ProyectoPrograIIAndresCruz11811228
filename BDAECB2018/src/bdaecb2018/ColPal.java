/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdaecb2018;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author MBanegas
 */
public class ColPal {

    HashMap<String, Color> myMap = new HashMap<String, Color>();

    public ColPal(JTextPane textPane) {
        try {
            myMap.put("CREATE", Color.BLUE);
            myMap.put("DROP", Color.BLUE);
            myMap.put("SELECT", Color.BLUE);
            myMap.put("FROM", Color.BLUE);
            myMap.put("WHERE", Color.BLUE);
            myMap.put("AND", Color.BLUE);
            myMap.put("OR", Color.BLUE);
            myMap.put("GRANT", Color.BLUE);
            myMap.put("DATABASE", Color.BLUE);
            myMap.put("TO", Color.BLUE);
            myMap.put("INSERT", Color.BLUE);
            myMap.put("INTO", Color.BLUE);
            myMap.put("VALUES", Color.BLUE);
            myMap.put("TABLE", Color.BLUE);
            myMap.put("UPDATE", Color.BLUE);
            myMap.put("SET", Color.BLUE);
            myMap.put("DELETE", Color.BLUE);
            myMap.put("TRUNCATE", Color.BLUE);
            String text = textPane.getText();
            textPane.setText("");
            StyledDocument doc = textPane.getStyledDocument();
            Style style = textPane.addStyle("Red Style", null);
            StyleConstants.setForeground(style, Color.red);
            ArrayList<Chunk> chunks = getColorsBasedOnText(text, textPane);
            try {
                for (Chunk chunk : chunks) {
                    doc.insertString(doc.getLength(), chunk.text + " ", chunk.style);
                }
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private ArrayList<Chunk> getColorsBasedOnText(String text, JTextPane textPane) {
        ArrayList<Chunk> chunks = new ArrayList<Chunk>();
        for (String word : text.split(" ")) {
            Chunk chunk = new Chunk();
            chunk.text = word;
            Color color;
            if (myMap.containsKey(word)) {
                color = myMap.get(word);
            } else {
                color = Color.BLACK;
            }
            if (color != null) {
                chunk.style = textPane.addStyle("Style", null);
                StyleConstants.setForeground(chunk.style, color);
            }
            chunks.add(chunk);
        }
        return chunks;
    }

    private class Chunk {

        public String text;
        public Style style;
    }
}

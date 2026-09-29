package ai0929.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CenterFrame{
    public static int[] getLocation(int w, int h) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSizeDim = toolkit.getScreenSize();
        int sw = screenSizeDim.width;
        int sh = screenSizeDim.height;
        int x = (sw-w)/2;
        int y = (sh-h)/2;
        int[] location = {x,y};
//        Dimension locationDim = new Dimension(x,y);

        return location;
    }
}
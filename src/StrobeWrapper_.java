/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahodge
 */

import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;


import mmcorej.CMMCore;
import org.micromanager.MMStudioMainFrame;





public class StrobeWrapper_ implements PlugIn {

    public void run(String arg) {

        CMMCore core = MMStudioPlugin.getMMCoreInstance();
    	IJ.showMessage("My_Plugin","Hezdfgaglo wodfsvagvrld!");
//        CMMCore core = MMStudioMainFrame.getCore();

        int a = 3;

        GetCore blargh = new GetCore(core);
        //blargh.setVisible(true);

        StrobeGUIFrame sadas = new StrobeGUIFrame();
        sadas.setVisible(true);

    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupk_roko;

import groupk_roko.CalculatorEditor;
import groupk_roko.CalculatorMenu;

/**
 *
 * @author rokom
 */
public class GroupK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Roko's menu initialisation statements
        CalculatorMenu rokosMenu = new CalculatorMenu();
        CalculatorEditor rokosEditor = new CalculatorEditor();
        rokosMenu.setCalcEditorMenu(rokosEditor);
        rokosMenu.setLocationRelativeTo(null);
        rokosEditor.setCalculatorMenu(rokosMenu);
        rokosEditor.setLocationRelativeTo(null);
        
        // render the GUI
        rokosMenu.setVisible(true);
    }
    
}


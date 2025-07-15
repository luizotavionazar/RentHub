/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.renthub.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;

// Criado por Jhonnie em 08/07/2023
public class UtilsComponent {
    public void aplicaHoverEntered(JButton button){
        button.setBackground(new Color(155,155,155));
    }
    public void aplicaHoverExited(JButton button){
        button.setBackground(new Color(240,240,240));
    }
    public void restauraCor(JButton button){
        button.setBackground(new Color(240,240,240));
    }
    
    public void configJspinner(JSpinner... spinners){
        Color corFundo = new Color(215,215,215);
        for(JSpinner spinner : spinners){
            JComponent editor = spinner.getEditor();
            if(editor instanceof JSpinner.DefaultEditor){
                JFormattedTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();
                textField.setBackground(corFundo);
            }
        }
    }
}

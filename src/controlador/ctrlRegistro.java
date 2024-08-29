/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.frmRegistro;

/**
 *
 * @author Estudiante
 */
public class ctrlRegistro implements MouseListener{
    
    //1-Mandar a llamar a las otras capas
    frmRegistro Vista;
    
    //2-Constructor
    public ctrlRegistro (frmRegistro vista){
        this.Vista = vista; 
        Vista.btnregistro.addMouseListener(this); 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == Vista.btnregistro){
        
            //1-Campos vacios
            if(Vista.txtNombre.getText().isBlank()){
                JOptionPane.showMessageDialog(Vista, "Llene los campos");
            }
            
            //2-Correo ingresado sea visible 
            if(!Vista.txtCorreo.getText().contains("@") || !Vista.txtCorreo.getText().contains(".com")){
                JOptionPane.showMessageDialog(Vista, "Ingrese un correo valido");
            }
            
            //3-Contraseña nas de 6 caracteres
            if(Vista.txtclave.getText().length() < 6){
                JOptionPane.showMessageDialog(Vista, "La contraseña debe tener mas de 6 digitos");
            }
            
            //4- Edad
           
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}

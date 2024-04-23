/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Adrian
 */
public class MenuPrincipal  extends JFrame{
    public MenuPrincipal(){
        JPanel menu1 = new JPanel();
        menu1.setLayout(null);
             
        // creo mi objeto con clase Toolkit
        Toolkit mipantalla= Toolkit.getDefaultToolkit();
        // Uso metodo "getScreenSize" para sacar el tamaño de la pantalla(nos devuelve un objeto de tipo "Dimension")
        Dimension tamanoPantalla= mipantalla.getScreenSize();
        // "Dimension" nos da 2 valores int para altura y ancho. Declaramos variables para obtener los tamaños
        int alturaPantalla= tamanoPantalla.height;
        int anchoPantalla= tamanoPantalla.width;
        
        // Indicamos tamaño pantalla con los valores de dimension/2 para que nos quede de media pantalla
        setSize(anchoPantalla/2, alturaPantalla/2);
        // Coloco la pantalla en /4 /4 para que quede centrado
        setLocation(anchoPantalla/4,alturaPantalla/4);
        // Hacemos que no se pueda redimensionar
        setResizable(false);
        // Se tiene que poder ver
        setVisible(true);
        //Titulo menu principal
        setTitle("Menu principal de la NASA");
        // Añadimos icono esquina superior izquierda;
        Image miIcono= mipantalla.getImage("src/nasa.gif");
        setIconImage(miIcono);
        // Indicamos que se termine el programa cuando se cierre la pantalla        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton botonMisiones = new JButton("MENU MISIONES");
        botonMisiones.setBounds(anchoPantalla/4,alturaPantalla/4,150,20);
        menu1.add(botonMisiones);
        
        
        
        
        
        
        
    }   
}

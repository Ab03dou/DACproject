/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classimgapp;

/**
 *
 * @author ABDOU
 */
public class ClassImgApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomingPage().setVisible(true);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassificationPage().setVisible(true);
            }
        });
    }
    
}
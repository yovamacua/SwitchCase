/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

/**
 *
 * @author Yova
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 3;
        switch(x){
            case 1:
                System.out.println("opcion 1");
                break;
            case 2:
                System.out.println("opcion 2");
                break;
            case 3:
                System.out.println("opcion 3");
                break;
                
            default:
                System.out.println("no es ninguna opcion anterior");
        
        }
    }
    
}

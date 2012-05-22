/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dai.Interfaces;

import java.util.ArrayList;
import services.Dservices;

/**
 *
 * @author Mk-is
 */
public interface ICRUDServices {
    //create method
    void create(Dservices service);
    
    //read method
    ArrayList read();
    
    //update method
    void update(Dservices service);
    
    //delete method
    void delete(Dservices service);
    
}

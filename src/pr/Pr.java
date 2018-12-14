/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;

import com.das.controller.Exception_Exception;
import com.das.controller.Hello;
import com.das.controller.HelloResponse;
import com.das.controller.Insert;
import com.das.controller.InsertResponse;
import com.das.controller.ObjectFactory;
import com.das.controller.Service;
import com.das.controller.Service_Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author diego
 */
public class Pr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        try {
            URL url = new URL("http://localhost:8082/miPrimerWebServic/service?wsdl");
            Service_Service d = new Service_Service(url);
            Service service = d.getServicePort();
            InsertResponse response = new InsertResponse();
            boolean respuesta = service.insert("AA", "BB", "CC");
            System.out.println(respuesta);
        } catch (Exception_Exception ex) {
            Logger.getLogger(Pr.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}

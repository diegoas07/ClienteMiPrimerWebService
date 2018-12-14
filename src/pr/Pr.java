/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;

import com.das.controller.InsertResponse;
import com.das.controller.Service;
import com.das.controller.Service_Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Pr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
            URL url = new URL("http://localhost:8080/miPrimerWebServic/service?wsdl");
            Service_Service d = new Service_Service(url);
            Service service = d.getServicePort();
            InsertResponse response = new InsertResponse();
            boolean respuesta = service.insert("AA", "BB", "3" );
            System.out.println("insert: "+respuesta);
            
            respuesta = service.updateUser("aup", "as", "1");
            System.out.println("update:" +respuesta);
            
            List<String> list = service.find("2");
            System.out.println("find: " + list.size());
            if (list != null && !list.isEmpty()) {
                System.out.println("cc: "+list.get(0));
                System.out.println("name: "+list.get(1));
                System.out.println("ape: "+list.get(2));
            }
    }
    
}

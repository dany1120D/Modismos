/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dao.ModismoDao;
import com.utileria.Modismo;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class DipsionarioTest {
    public DipsionarioTest(){}
    
//    @Test
//    public void testCreate(){
//        Modismo modismo =new Modismo(2,"Voltion","Dar la vuelta(Pasear)" ,"chihuahua");
//        ModismoDao modismoDao=new ModismoDao();
//        modismoDao.create(modismo);
//    
//    }
//    @Test
//    public void testCreate2(){
//        Modismo modismo =new Modismo(3,"reborujado","Que esta confuso " ,"Julimes");
//        ModismoDao modismoDao=new ModismoDao();
//        modismoDao.create(modismo);
//    
//    }
    @Test
    public void testRead(){
     
        ModismoDao modismoDao=new ModismoDao();
        List <Modismo> listaModismos= modismoDao.read();
        for(Modismo modismo: listaModismos)
        {
            System.out.println(modismo.getPalabra()+ " Significado---> "+modismo.getDefinicion());
        }
    
    }
//     @Test
//    public void testUpdate(){
//        Modismo modismo =new Modismo(3,"reborujado","Que esta confuso muy confuso" ,"Julimes");
//        ModismoDao modismoDao=new ModismoDao();
//        assertTrue(modismoDao.update(modismo));
//    
//    }
//     @Test
//    public void testDelete(){        
//        ModismoDao modismoDao=new ModismoDao();
//        assertTrue(modismoDao.delete(1));
//        
//        
//    
//    }
    
}

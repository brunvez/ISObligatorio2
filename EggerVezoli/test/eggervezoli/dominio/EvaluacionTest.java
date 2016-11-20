/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.dominio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno
 */
public class EvaluacionTest {
    
    @Test
    public void testSetCalificacionCambiaLaCalificacion() throws InvalidCalificationException{
        int calificacion = 3;
        Evaluacion instance = new Evaluacion(2, null, null, null);
       
        instance.setCalificacion(calificacion);
        
        assertEquals(calificacion, instance.getCalificacion());
    }
    
    @Test(expected = InvalidCalificationException.class)
    public void testSetCalificacionLanzaExcepcionSiLaCalificacionEsMenorQue0() throws InvalidCalificationException{
        int calificacion = 0;
        Evaluacion instance = new Evaluacion(2, null, null, null);
       
        instance.setCalificacion(calificacion);
    }
    
     @Test(expected = InvalidCalificationException.class)
    public void testSetCalificacionLanzaExcepcionSiLaCalificacionEsMenorQue5() throws InvalidCalificationException{
        int calificacion = 6;
        Evaluacion instance = new Evaluacion(2, null, null, null);
       
        instance.setCalificacion(calificacion);
    }
}

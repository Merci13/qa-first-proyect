/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import db.db_methodos;

/**
 *
 * @author jorge
 */
public class metodos_de_clase {
       db_methodos db = new db_methodos();
    
    
    
    /***
     * Requisito (1) Registrar horarios de recorridos, con los siguientes datos:
     *código de horario, número del bus, descripción de horario, tiempo de
     *salida, tiempo de llegada, estado.
     */
    
    void schedualRegister(
            String diaInicio,
            String diaFinal,
            String Ruta,
            int placaBus,
            String descripcionDelHorario,
            String horasDeSalida,
            String horasDeLlegada){
        
        
     db.schedualRegister( diaInicio,
             diaFinal,
             Ruta,
             placaBus,
             descripcionDelHorario,
             horasDeSalida,
             horasDeLlegada);
        
        
    
    
    }
    
}

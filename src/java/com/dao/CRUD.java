/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.utileria.Modismo;
import java.util.List;

/**
 *
 * @author danie
 */
public interface CRUD {
    void create(Modismo modismo);
    List read();
    boolean update(Modismo modismo);
    boolean delete(int id_palabra);
    
}

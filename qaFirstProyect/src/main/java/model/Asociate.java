/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author josue
 */
public class Asociate {
    
    String name;
    int line;
    String last_name;
    Boolean status;
    int id;

    public Asociate(String name, int line, String last_name, Boolean status, int id) {
        this.name = name;
        this.line = line;
        this.last_name = last_name;
        this.status = status;
        this.id = id;
    }

    
    
    public Asociate() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Asociate{" + "name=" + name + ", line=" + line + ", last_name=" + last_name + ", status=" + status + ", id=" + id + '}';
    }
    
    
    
    
}

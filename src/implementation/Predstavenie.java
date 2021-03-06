/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import java.sql.Date;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;



/**
 *
 * @author Marcel
 */
public class Predstavenie {
    
    private Integer udalost_id;
    private StringProperty name;
    private Date datum;
    private Integer available_seats;
    
    public Predstavenie(int id,String name, Date datum)
    {
        this.udalost_id = id;
        this.name = new SimpleStringProperty(name);
        this.datum = datum;
    }
    
    public Predstavenie(String name, Date datum, int available_seats)
    {
    //    this.udalost_id = udalost_id;
        this.name = new SimpleStringProperty(name);
        this.datum = datum;
        this.available_seats = available_seats;
    }
//     public Predstavenie(String name, Date datum)
//    {
//    //    this.udalost_id = udalost_id;
//        this.name = new SimpleStringProperty(name);
//        this.datum = datum;
//    }   
    public String getName(){
        return name.get();
    }
    public Integer getID(){
        return udalost_id;
    }
    public Integer getSeats(){
        return available_seats;
    }    
    public void setName(String nName){
        name.set(nName);
    }

    
    public Date getDatum(){
        return datum;
    }
}


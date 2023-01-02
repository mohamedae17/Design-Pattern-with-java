/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author DELL
 */
public class EmployeeRecord implements Prototype{
    int id; String name; double salary; String address;
    EmployeeRecord(){System.out.println("  Welcome to Orale Corporation ");}
    
    public EmployeeRecord(int ID,String NAME , double SALARY , String ADDRESS){
        this();
        this.id = ID;
        this.name = NAME;
        this.salary = SALARY;
        this.address = ADDRESS;
    }


    public void showRecord(){
        System.out.println(this.id + "\t" + this.name + "\t" + "\t" + this.salary + "\t"+this.address);
    }
    
    public Prototype getClone(){
        return new EmployeeRecord(this.id,this.name,this.salary,this.address);
    }
}

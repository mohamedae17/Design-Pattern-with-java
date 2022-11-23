/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author DELL
 */
public class GetPlanFactory {
    public  Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("Domesticplan")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("CommericalPlan")){
            return new CommericalPlan();
        }
        else if(planType.equalsIgnoreCase("institutionalPlan")){
            return new institutionalPlan();
        }
        return null;
    }
}

package com.training.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {
 public static void main(String[] args) {
     Mobile m1 = new Mobile();
     String add = m1.addMobile("Samsung", "S12");
     System.out.println(add);
     List<String> get = m1.getModel("Samsung");
     System.out.println(get);
     String buy = m1.buyMobile("Samsung", "S12");
     System.out.println(buy);
 }
}
class Mobile{
 HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
  ArrayList<String> models = new ArrayList<>();
 
 public String addMobile(String company, String model){
     
     if(!mobiles.containsKey(company)){
    	 models.add(model);
         mobiles.put(company, models);
     }
     else{
    	 mobiles.get(company).add(model);
     }
      return "Model added Successfully ";
 }
 
 public ArrayList<String> getModel(String company){
     
     if(mobiles.containsKey(company)){
          ArrayList<String> allModels = mobiles.get(company);
          return allModels;
          
     }
     else{
         return null;
     }
 }
 
 public String buyMobile(String company, String model){
     if(mobiles.containsKey(company)){
        List<String> allModels = mobiles.get(company);
        allModels= allModels.stream().filter(m -> m.equalsIgnoreCase(model)).collect(Collectors.toList());
        return "Mobile Sold Successfully";
     }
     else{
         return "Item Not Available";
     }
 }
 
 
}
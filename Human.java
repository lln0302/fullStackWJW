package Homework;

import java.util.*;


public class Human implements Runnable, Speak {
    public static void main(String[] args) {
    }
    interface Runnable{
        void run();
    }
    
    interface Speak{
        void silent();
        void loud();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    } 
}

class Animal{
    private String name;
    private String location; 

    public void setName(String name) {
        this.name = name; 
    }
    public String getName() {
        return name;
    }

    public void setLocation(String location){
       System.out.println("land or sea or air");
        String scan = new Scanner(System.in).nextLine();              //scan이 되는지 확인되지 않음 + 보완해야함
        if (scan.equals("land") || scan.equals("sea") || scan.equals("air")){
            this.location = location;
            }
            else {
                System.out.println("land or sea or air");
            }     
        }   

    public String getLocation(){
        return location;
        
    } 
    // -> land, sea, air만 입력 가능
}

class Tiger extends Animal{

}
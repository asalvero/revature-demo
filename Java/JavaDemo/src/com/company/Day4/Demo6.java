package com.company.Day4;

public class Demo6 {
    public static void main(String[] args) {
        //case1: exception not occur
        try{
            int c = 10/5;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Case 1: finally called");
        }

        //case2: exception occurred and not handled
        try{
            int c = 20/0;
        }catch(Exception ex){

        }finally{
            System.out.println("Case 2: finally called");
        }

        //case3: exception occurred and handled
        try{
            int c = 20/0;
            System.out.println(c);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Case 3: finally called");
        }
    }
}

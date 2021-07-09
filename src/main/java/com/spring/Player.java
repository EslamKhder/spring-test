package com.spring;

import java.util.LinkedList;
import java.util.List;

public class Player {

    String name;
    private List<String> players = new LinkedList<>();


     public Player(){
         players.add("Treka");
         players.add("Messi");
         players.add("CR7");
         players.add("M Salah");
     }

    public Player(String name) {
        this.name = name;
    }

    public String getName(String name){
        for (int i=0;i<players.size();i++){
            if(players.get(i).equals(name)){
                return players.get(i);
            }
        }
        return null;
     }

}

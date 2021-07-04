package com.spring;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

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

    public Player getName(String name){
        for (int i=0;i<players.size();i++){
            if(players.get(i).equals(name)){
                return new Player(players.get(i));
            }
        }
        return null;
     }

    @Override
    public boolean equals(Object o) {
       Player player = (Player) o;

       return name.equals(player.name);
    }

}

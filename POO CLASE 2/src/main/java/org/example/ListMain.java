package org.example;

import java.util.ArrayList;
import java.util.List;


public class ListMain {
    public static void main(String[] args) {
        List<persona> per=new ArrayList<>();
        per.add(new persona("pablito","p",'f'));
        per.add(new persona("pablito","p",'f'));
        per.add(new persona("pedro","p",'f'));
        System.out.println(per.get(2).getNombre());

        ArrayList<persona>p=new ArrayList<>();
        p.add(new persona("pablito","p",'f'));
        System.out.println(p.get(0).getNombre());

        persona[] pp=new persona[10];
        pp[0]=new persona("pablito","p",'f');
        System.out.println(pp[0].getNombre());




    }
}

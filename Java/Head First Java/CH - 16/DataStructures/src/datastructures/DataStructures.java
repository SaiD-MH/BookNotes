package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.logging.Level;

public class DataStructures {

    public void go() {
       /* ArrayList<Animal>animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
                
        
        ArrayList<Dog>D = new ArrayList<Dog>();
        D.add(new Dog());
        D.add(new Dog());
        
        takeAnimals(animals);
        takeAnimals(D);
        //takeAnimals(dogs);*/
       
       Dog [] arr = {new Dog() ,  new Dog() };
        takeAnimals(arr);
       
       
    }

    public void takeAnimals(Animal []arr) {
        for (Animal a : arr) {
            a.eat();
        }
    }

/*
    
    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
        return one.getArtist().compareTo(two.getArtist());
    }
    }   
    class TitleCompare implements Comparator<Song>{
        public int compare(Song s1 , Song s2){
            return s1.getTitle().compareTo(s2.getTitle());
        }
    }
    
   static ArrayList<Song> lst = new ArrayList<Song>();
    public static void main(String[] args) throws IOException {

       new DataStructures().go();
       
       
       
        
        
    }
    
    
    public void go() throws FileNotFoundException, IOException{
        
        BufferedReader bf = new BufferedReader(new FileReader("songs.txt"));
        
        String s = null;
        while((s = bf.readLine())!=null){
            
            modifiy(s);
            
        }
        
        
    //    Collections.sort(lst,new TitleCompare());
        System.out.println(lst);
        TreeSet<Song> hSet= new TreeSet<Song>();
        hSet.addAll(lst);
        
       
        
        System.out.println(hSet);
        
    }
    
    private static void modifiy(String s){
         String []arr = s.split("/");
        lst.add(new Song(arr[0],arr[1],arr[2],arr[3]));
        
    }
 */
public static void main(String[] args) {
    
        
    new DataStructures().go();
    
    
       // new DataStructures().go();
       
     
       
       /*
       HashMap<Integer , Boolean> mp= new HashMap<Integer , Boolean>();
       
       mp.put(1,true);
       mp.put(7,true);
       mp.put(5,true);
       
        System.out.println(mp.get(7));
        System.out.println(mp.get(1));
        System.out.println(mp.get(45));
       
        System.out.println(mp);
*/
                
    }

/*public void go() {
Book b1 = new Book("How Cats Work");
Book b2 = new Book("Remix your Body");
Book b3 = new Book("Finding Emo");

TreeSet<Book> tree = new TreeSet<Book>();
tree.add(b1);
tree.add(b2);
tree.add(b3);
System.out.println(tree);

}


class Book implements Comparable<Book> {

String title;

public Book(String t) {
title = t;
}

@Override
public int compareTo(Book o) {
return this.title.compareTo(o.title);
}

}*/
}

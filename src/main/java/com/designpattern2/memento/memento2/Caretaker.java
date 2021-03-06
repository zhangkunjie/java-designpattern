package com.designpattern2.memento.memento2;
import java.io.*;
//�����ˣ�CareTaker��
public class Caretaker{
      File file;
      private Memento  memento=null;
      Caretaker(){
           file=new File("saveObject.txt");
      }
      public  Memento getMemento(){
           if(file.exists()) {
               try{
                     FileInputStream  in=new FileInputStream("saveObject.txt");
                     ObjectInputStream  inObject=new ObjectInputStream(in);
                     memento=(Memento)inObject.readObject();
               }
               catch(Exception exp){}
           }
           return  memento;
      }
      public void saveMemento(Memento  memento){
            try{
                     FileOutputStream  out=new FileOutputStream("saveObject.txt");
                     ObjectOutputStream  outObject=new ObjectOutputStream(out);
                     outObject.writeObject(memento);
               }
               catch(Exception exp){}  
      }
}

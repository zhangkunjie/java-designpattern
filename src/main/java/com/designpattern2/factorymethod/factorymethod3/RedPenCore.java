package com.designpattern2.factorymethod.factorymethod3;
//��ɫ��о
public class RedPenCore extends PenCore{
    RedPenCore(){
      color="��ɫ";
    }
    public void writeWord(String s){
       System.out.println("д��"+color+"����:"+s);
    }
}

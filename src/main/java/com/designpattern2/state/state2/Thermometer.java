package com.designpattern2.state.state2;
//������Context��
public  class  Thermometer{
       TemperatureState  state;
       public  void  showMessage(){
            System.out.println("***********");
            state.showTemperature();  
            System.out.println("***********");
      }
      public void setState(TemperatureState  state){
            this.state=state;
      }
}

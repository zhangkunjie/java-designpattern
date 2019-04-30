package com.designpattern2.state.state2;
//ģʽ��ʹ��
public class Application{
     public static void main(String args[]) {
           TemperatureState state=new LowState(-12);
           Thermometer  thermometer=new Thermometer();
           thermometer.setState(state);
           thermometer.showMessage();
           state=new MiddleState(20);
           thermometer.setState(state);
           thermometer.showMessage();
           state=new HeightState(39);
           thermometer.setState(state);
           thermometer.showMessage();
     }
}

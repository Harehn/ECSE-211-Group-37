package ca.mcgill.ecse211.lab1;

import static ca.mcgill.ecse211.lab1.Resources.*;



public class BangBangController extends UltrasonicController {
  int lspeed= 50;
  int rspeed =50;
  int time = 0;
  
  public BangBangController() {
    LEFT_MOTOR.setSpeed(lspeed); // Start robot moving forward
    RIGHT_MOTOR.setSpeed(rspeed);
    //LEFT_MOTOR.forward();
    //RIGHT_MOTOR.forward();
  }

  @Override
  public void processUSData(int distance) {
    filter(distance);
    
    /**if(distance>100){
      LEFT_MOTOR.forward();
      RIGHT_MOTOR.forward();
    }else {
      LEFT_MOTOR.backward();;
      RIGHT_MOTOR.backward();;
    }**/
    
    
    
    
    
    
  }
  
  public void turnRight() {
    LEFT_MOTOR.setSpeed(MOTOR_HIGH);
    RIGHT_MOTOR.setSpeed(MOTOR_LOW);
  }
  
  public void turnleft() {
    LEFT_MOTOR.setSpeed(MOTOR_LOW);
    RIGHT_MOTOR.setSpeed(MOTOR_HIGH);
  }

  @Override
  public int readUSDistance() {
    return this.distance;
  }
}

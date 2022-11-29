package Activity;

interface BicycleParts
{
  public int gears = 0 ;
  public int speed =0;
}
interface BicycleOperations
{
  public void  applyBrake(int decrement);
  public void  speedUp(int increment);

}

public class Bicycle implements BicycleParts , BicycleOperations
{
 public  int gears ;
 public int  currentSpeed ;

 public Bicycle(int gears , int currentSpeed)
 {
     this.gears =gears;
     this.currentSpeed=currentSpeed;
 }



}
public class Activity7 {
}

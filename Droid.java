public class Droid
{
  private int batteryLevel;
  private String name;
  
  public Droid(String droidName)
  {
    name = droidName;
    batteryLevel = 100-10;
  }
  
  public void performTask(String task)
  {
    System.out.println(name + " is performing task: " + task);
  }
  public String toString()
  {
    String introduction = "Hello, I'm the droid: " + name;
    return introduction;
  }

  public void energyReport(){
    System.out.println("The battery level is "+ batteryLevel);
  }
    public static void main(String [] args)
  {
    Droid Codey = new Droid("Codey");
    
    System.out.println(Codey.toString());

    Codey.performTask("dancing");

    Codey.energyReport();
  }
}
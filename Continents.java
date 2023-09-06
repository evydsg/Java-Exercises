public class Continents
{
  //This program will print out a continent and the largest city in that continent, based on the value of an integer
  public static void main(String [] args)
  {
      int continent = 4;

      switch(continent)
      {
        case 1:
        System.out.println("North America: \nMexico City, Mexico");
        break;

        case 2:
        System.out.println("South America: \nSao Paulo, Brazil");
        break;

        case 3:
        System.out.println("Europe: Moscow, Russia");
        break;

        case 4:
        System.out.println("Africa: Lagos, Nigeria");
        break;

        case 5:
        System.out.println("Asia: Shangai, China");
        break;

        case 6:
        System.out.println("Australia: Sydney, Australia");
        break;

        case 7:
        System.out.println("Antarctica: McMurdo Station, US");
        break;

        default:
        System.out.println("Undefined continent!");
        break;
      }
  }
}
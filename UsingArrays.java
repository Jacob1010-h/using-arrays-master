
/**
 * Write a description of class UsingArrays here.
 * 
 * @author (Jacob Hotz)
 * @version (v1.0)
 */
public class UsingArrays
{

  public static void main(String[] args) {
    int[] grades = {4,2,3,1,3,3,2,0,4,5,5,1,0};
    System.out.println("The average is " + average(grades));
  }
    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
          sum += array[i];
        }
        //round to 2 decimal places
        return Math.round((sum / array.length) * 100.0) / 100.0;
    }

}

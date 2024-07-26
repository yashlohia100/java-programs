import java.util.*;

public class C{
    public static void main(String[] args) {
        try {
			Scanner sc=new Scanner(System.in);
            int num1=sc.nextInt();
			int num2=sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Exception encountered: " + ex);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        } catch (NullPointerException el) {
            System.out.println("Null pointer exception: " + el);
        } catch (Exception ez) {
            System.out.println("General exception: " + ez);
        }
		finally
		{
			System.out.println("Execution Complete");
		}
    }
}
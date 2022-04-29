public abstract class Burger
{
 final public void prepareBurger()
 {
  createBun();
  createPattey();
  addStuffings();
  CheeseOrBean();
  serve();
 }

public void createBun()
{
  System.out.println("Making a Bun for Burger...");
}
 public void createPattey()
 {
  System.out.println("Create patties to put in burger...");
 }
 abstract void CheeseOrBean();

 public void addStuffings()
 {
  System.out.println("Add Stuffings of cabbage, tomato and onion...");
 }
 public void serve()
 {
  System.out.println("Serve with mayo and red chatnii...");
 }
} 

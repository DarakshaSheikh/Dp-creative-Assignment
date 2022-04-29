class Test
{
  public static void main(String args[])
  {      
    System.out.println("------------Stuffed Cheese Burger------------");
     Burger b = new StuffedCheeseBurger();
     b.prepareBurger();
     System.out.println("");
     System.out.println("-------------Stuffed Bean Burger-------------");
     Burger b1 = new StuffedBeanBurger();
     b1.prepareBurger();
  }
}

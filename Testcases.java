public class Testcases {
  public static void main(String[] args) {
  // TODO Auto-generated method stub
    // Calculator cl = new Calculator(6,3);
    // if(cl.sum(6,3)==9)
    // {
    //   System.out.println("Sum Executed successfully");
    // }
    // if(cl.multiply(6,3)==18)
    // {
    //   System.out.println("Multiply Executed successfully");
    // }
    // if(cl.division(6,3)==2)
    // {
    //   System.out.println("division Executed successfully");
    // }
    // if(cl.subtract(6,3)==3)
    // {
    //   System.out.println("Subtract Executed successfully");
    // }

    Calculator cl = new Calculator(new int[]{1,1,1},new int[]{1,1,1});
    int[] result;
    result = cl.measure("sum");
    System.out.println("sum:");
    for(int i=0;i<result.length;i++)
    {
      System.out.print(result[i]+",");
    }
    System.out.println();
    result = cl.measure("product");
    for(int i=0;i<result.length;i++)
    {
      System.out.print(result[i]+",");
    }
    System.out.println();
    result = cl.measure("division");
    for(int i=0;i<result.length;i++)
    {
      System.out.print(result[i]+",");
    }
    System.out.println();
    result = cl.measure("subtract");
    for(int i=0;i<result.length;i++)
    {
      System.out.print(result[i]+",");
    }
}
}
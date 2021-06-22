package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    //size of interger assume as a 32 biy
    for (int i=31;i>=0;i--)
    {
      int k=n>>i;
      if ((k & 1)>0)
          System.out.println("1");
      else
          System.out.println("0");
    }
  }
}
class karan
  public static void main(String[] args)
{
  ConvertToBinary c=new ConvertToBinary();
  int n=32;
  g.toBinary(n);
}
}

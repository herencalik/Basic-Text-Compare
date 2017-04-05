import java.util.*;
import java.io.*;

public class Ýslem
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("firstText.txt");
      File file1 = new File("secondText.txt");
      Scanner firstText = new Scanner(file);
      Scanner secondText = new Scanner(file1);
      firstText.useDelimiter("\n\n\n");
      secondText.useDelimiter("\n\n\n");
      String[] firstTextArray = new String[2000000];
      String[] secondTextArray = new String[2000000];
      int count=0;
      while(firstText.hasNext())
      {
         firstTextArray[count]=firstText.nextLine();
         count++;
      }
      count=0;
      while(secondText.hasNext())
      {
         secondTextArray[count]=secondText.nextLine();
         count++;
      }
      boolean isTrue;

     for(int i = 0;firstTextArray[i]!= null;i++)
      {
          isTrue=false;
          for(int j=0;secondTextArray[j]!=null;j++)
          {
            if(secondTextArray[j].equals(firstTextArray[i]))
            isTrue = true;
          }
          if(!isTrue)
          System.out.println(firstTextArray[i]);
      }
      
      System.out.println("\n\n");
      
           for(int b = 0; secondTextArray[b]!= null;b++)
      {
          isTrue=false;
          for(int f=0;firstTextArray[f]!=null;f++)
          {
            if(firstTextArray[f].equals(secondTextArray[b]))
            isTrue = true;
          }
          if(!isTrue)
          System.out.println(secondTextArray[b]);
      }
      
   }
}
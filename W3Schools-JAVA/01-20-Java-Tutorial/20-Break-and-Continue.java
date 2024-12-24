Java Break and Continue

Java Break 

  ** You have already seen the break statement in a earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

  ** The break statement can also be used to jump out ofa loop.

  ** This example stops the loop when i is equal to 4:


Example 

  public class Main {
    public static void main(String[] args) {       
      for (int i = 0; i < 10; i++) {
        if (i == 4) {
          break;
        }
        System.out.println(i);
      }
    }
  }
>>>
0
1
2
3
--- This is the output of the above code --- 



Java Continue 

  ** The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop. 


  ** This example skips the value of 4:

Example 

  public class Main {
    public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
        if (i == 4) {
          continue;
        }
          System.out.println(i);
      }
    }
  }  


>>>
0
1
2
3
5
6
7
8
9

^^ 4 is not in there 

-------------------

Break and Continue in While Loop 

  ** You can use break and continue in while loops:


Break Example 

public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }
  }
}

Continue Example 

public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i <= 10) {
      if (i == 4) {
        i++;
        continue;
      }
    
    System.out.println(i);
    i++
    }
  }
}

>>> 
0
1
2
3
5
6
7
8
9

--- ^^ the value 4 is not in there ---
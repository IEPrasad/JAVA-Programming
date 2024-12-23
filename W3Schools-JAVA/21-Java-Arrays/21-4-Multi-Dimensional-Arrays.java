Java Multi-Dimensional Arrays

Multidimensional Arrays 

  ** A multidimensional array is an array of arrays.

  ** Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

  ** The create a two-dimensional array, add each array within its own set of curly braces:

Example

  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

  ** myNumbers is now an array with two arrays as its elements.

Access Elements 

  ** To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example access the third element (2) in the second array (1) of myNumbers:

Example 

  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
  System.out.println(myNumbers[1][2]); // Output 7

** Remember that: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

Change Element Values

  ** You can also change the value of an element:

Example 

  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}};
  myNumbers[1][2] = 9;
  System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

-------

Loop Through a Multi-Dimensional Array

  ** You can also use for loop inside another for loop to get the elements of a two-dimensional array (we still have to point the two indexes):

Example 

  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
  for {int i = 0; i < myNumbers.length; ++i} {
    for {int j = 0; j < myNumbers[i].length; ++j} {
      System.out.println(myNumbers[i][j]);
    }
  }

** Or you could use a for-each loop, which is considered easier to read and write:

Example 

  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
  for (int[] row : myNumbers) {
    for (int i : row) {
      System.out.println(i);
    }
  }

  
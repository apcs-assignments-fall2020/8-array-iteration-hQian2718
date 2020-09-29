# Array Iteration

In this assignment, you'll be writing three methods to iterate through arrays

The first method is reverse(). This method takes an array of integers as input, and returns an array of integers containing the elements in the original array in reversed order. The method has the following signature: public static int[] reverse(int[] arr) {}

The second method is secondLargest(). This method takes an array of integers as input, and returns the second largest number in an array. You may assume the array contains at least 2 values. The method has the following signature: public static int secondLargest(int[] arr) {}

The third method is isGeometric(). This method takes an array of integers as input, and returns true if the values in the array correspond to a geometric series. A geometric series is a series of numbers where the next number is equal to the current number times some set factor. For instance, the following array contains a geometric series because each number is twice as large as the previous number: [1, 2, 4, 8, 16, 32]. The values in the arrays will all be integers; however, the factor may be a number less than 1. The method has the following signature: public static boolean isGeometric(int[] arr) {} 

You don't need to include a Scanner in your main method. However, your main method should contain some code where you call your three functions to test that they work properly. 

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
```shell script
make run
```

## Run your tests with:
```shell script
make test
```
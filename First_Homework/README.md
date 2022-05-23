1.Suppose we create the following ArrayList instance:

ArrayList<String> words = new ArrayList<String>();
And then we insert several words into words. Write the code to print out each element of words that has exactly four letters. You should have three different versions of the code:

using an index;
using an explicit iterator;
using an enhanced for statement.


2.  Test and define the following method

/**
* In a given ArrayList, remove all duplicates.
* The worstTime(n) is O(n2).
*
* @param list - the given ArrayList.
*

* @return - An ArrayList that is identical to list except only the first
*           occurrence of duplicate elements remains.
*
* @throws NullPointerException - if list is null.
*
*/
public static <T> ArrayList <T> uniquefy (ArrayList <T> list)
For example, suppose myList consists of references to Integer objects with the following values, in sequence

3, 8, 6, 4, 8, 7, 8, 9, 4

Then the ArrayList returned by the call to uniquefy (myList) will consist of references to Integer objects with the following values, in sequence

3, 8, 6, 4, 7, 9


3.  Unit test and define the following method:

/**
* Removes the first and last 4-letter word from a given LinkedList<String> object.
* Each word will consist of letters only.
* The worstTime(n) is O(n).
*
* @param list - the LinkedList<String> object.
*
* @throws NullPointerException - if list is null.
* @throws NoSuchElementException - if list is not null, but list has no 4-letter
*                                   words or only one 4-letter word.
*
*/
public static void bleep (LinkedList<String> list)

4. Which of the following statements are true? (Choose all that apply.)
   Comparable is in the java.util package.
   Comparator is in the java.util package.
   compare() is in the Comparable interface.
   compare() is in the Comparator interface.
   compare() takes one method parameter.
   compare() takes two method parameters.


5. You are supposed to remove duplicate entries from a list. The constraint is that the original order should be preserved. Therefore write method List<T> removeDuplicates(List<T>).

Examples
Input -> Result

[1, 1, 2, 3, 4, 1, 2, 3] -> [1, 2, 3, 4]

[7, 5, 3, 5, 1]->[7, 5, 3, 1]

[1, 1, 1, 1]->[1]

6.  Compound Key
    Imagine that you want to use two or more values as a key in a map. That is, you want to use a so-called compound key . For example, such a key consists of two int values or of one String and one int. How can this be achieved?

Examples
Compound key (name, age) - Hobbies:
(Peter, 22) -> TV
(Mike, 48) -> Java, Cycling, Movies

Compound key (month, year)  - Conferences:
(September, 2019) -> ch open Zurich, Oracle Code One SF
(October, 2019) -> JAX London
(November, 2019) -> W-JAX Munich
7. Excel Magic Select
   If you have worked a little with Excel, then you have probably used the so-called Magic Selection. It continuously populates a selected area with values based on the previous values. This works for numbers, weekdays, or dates, for example. To achieve something similar on your own, write method List<Integer> generateFollowingValues(int, int), that implements this for numbers. Create a variation of this suitable for weekdays and with the following signature: List<DayOfWeek> generateFollowingValues(DayOfWeek, int)
   image.png
8.  Lowest Common Ancestor
    Compute the lowest common ancestor (LCA) for two nodes, A and B, hosted in an arbitrary binary search tree. The LCA denotes the node that is the ancestor of both A and B and is located as deep as possible in the tree (the root is always the ancestor of both A and B). Write method BinaryTreeNode<Integer> findLCA(BinaryTreeNode<Integer>, int, int), which, in addition to the start node of the search (usually the root) also receives lower and upper limits, which indirectly describe the nodes that are closest to these values. If the values for the limits are outside the range of values, then there is no LCA, and it is supposed to be returned null.

Example
A binary tree is shown below. If the least common ancestor is determined for the nodes with the values 1 and 5, this is the node with the value 4. In the tree, the respective nodes are circled, and the ancestor is additionally marked in bold.
6
|-----------+-----------|
➃                        7
|-----+-----|
2            ➄
|--+--|
➀      3

9. Write a program that creates a LinkedList object of 10 characters, then creates a second LinkedList object containing a copy of the first list, but in reverse order.

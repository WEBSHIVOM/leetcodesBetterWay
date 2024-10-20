package main.java.interviews;

/*
100 people standing in a circle in an order 1 to 100. No. 1 has a sword. He kills the next person (i.e. No. 2) and gives the sword to the next (i.e. No. 3). All people do the same until only 1 survives. Which number survives at the last?
There are 100 people starting from 1 to 100.

Solution:  73rd person will survive at last

Explanation 1  (intuitive and logical): We can observe that if the number of people standing in a circle is a power of 2, then the person starting the game will live. This is because after each round of killing, the number of people left will be reduced by 2 and no remainder would be there, thus, the next round will again start with the same person who initially started the game. And this will go on.

For the case when the number of people in the circle is not the power of two, then in the first round when the number of people alive becomes a power of 2, then the person holding the gun will win because basically, he is starting a game with people left in the power of 2. So, for 100, 36 people need to die when 64 people remain i.e. a number smaller than the given number and a power of two. 36th person to be killed will be 72nd person, thus 73rd person will have the gun when the number of people left alive is 64.


Explanation 2 (code):
Here, we can define an array with 100 elements with values from 1 to 100.


No.1 has a sword. He kills next person (i.e. no. 2) and gives sword to next (i.e no. 3).
We have taken array element as a person. 1st person kills the next. So, starting from 1,
we’ll remove next element i.e. 2.
Then first person gives sword to next i.e. 3. That person will also kill next
person and this continues. Means, in array, we need to start with 1
and remove the every other (alternate) element till 100.
(all the even numbers will be removed and we’ll be left with odd numbers only in array).
Round 1: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99
Round 2: 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61, 65, 69, 73, 77, 81, 85, 89, 93, 97
Round 3: 1, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97
Round 4: 9, 25, 41, 57, 73, 89
Round 5: 9, 41, 73
Round 6: 9, 73
Round 7: 73

To avoid the manual calculation done above, here the general algorithm :
Step 1 : For a given value of N, find the “Power of 2” immediately\
 smaller than N. Let’s call it P
Step 2 : Subtract N from (P-1). Lets call it M, i.e, M = (P-1)- N
Step 3 : Multiply M by 2. i.e M*2
Step 4 : Subtract M*2 from P-1. Let’s call it ans, i.e, ans = (P-1) – (M*2)
So, the person with number “ans” will survive till last.

Explanation 3 (For Java code):

Use Java’s collection Framework linkedList to simulate the game conditions
like a doubly circular linked list and arrive at the winner.
To go to next person to kill, use modulo to maintain circular
iteration and arrive at the result when only one person remains.
 */
public class RemainingSoldiers {
    
}

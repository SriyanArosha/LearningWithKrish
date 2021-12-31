<p align="center">
## Method/Block Behaviour
</p>

In this small report, I'm going to talk about how a static block, an empty block and a contructor would behave when it's located in the same class.
Before starting my explanation, let's look at what of these three different blocks defines.

## Static Block
A static block is a special block which gets executed only once when the class which its located is loaded into the memory.
So, there's no special method or way specified on how to call this static method since it executes automatically when the class is loaded into the memory.

## Empty Block
An empty block is consisted only of empty pair of braces and a code segment inside the braces, which means that the empty block doesn't have any name.
And this empty block is called when the object of the class is created with new keyword, but before the default constructor of this class is called.

## Constructor
A constructor is another special block which is called every time when a new instance of the class which its located is created. It has the same name of its class, but doesn't have any return type.

To explain the scenario, about how these three blocks behave, first I wrote a small program to show you how these three would behave with live example.

## Step One
In this step, I created a class called MethodBehaviour and created the static block, the empty block and the constructor in an order.
<p align="center">
<img src="https://github.com/SriyanArosha/LearningWithKrish/blob/master/Method%20Behaviour/ResultImages/method_behaviour_class.jpg" width="350" alt="Method Behaviour Class">
</p>

Then I created a MethodCallMain class which creates the new instance of the class.
<p align="center">
<img src="https://github.com/SriyanArosha/LearningWithKrish/blob/master/Method%20Behaviour/ResultImages/method_call_main_class.jpg" width="350" alt="Main Method Class">
</p>

When I compile and run the above MethodCallMain class, it produces the following output.
<p align="center">
<img src="https://github.com/SriyanArosha/LearningWithKrish/blob/master/Method%20Behaviour/ResultImages/result1.jpg" width="350" alt="First Result">
</p>

When we carefully check the above result, we can see that first the static block is called, then the empty block is called and finally the constructor is called.

## Step Two
Then in this step, I'm changing the places of these three blocks.(Starting with empty block, then the static block places and last the constructor)

Then again I compile and run the MethodCallMain class, it produces the following output.
<p align="center">
<img src="https://github.com/SriyanArosha/LearningWithKrish/blob/master/Method%20Behaviour/ResultImages/result2.jpg" width="350" alt="Second Result">
</p>

When we study the above result, we can see the same result we got as the Step One. At first, the static block is called, then the empty block and finally the constructor.

## Step Three
In this final step, I'm changing the places of these three blocks again.(This time, starting with constructor, then the empty block places and at last the static block)

Then again, I compile and run the MethodCallMain class, it produces the following output.
<p align="center">
<img src="https://github.com/SriyanArosha/LearningWithKrish/blob/master/Method%20Behaviour/ResultImages/result3.jpg" width="350" alt="Third Result">
</p>

Again it produces the same output which we got in Step One and Two.

## Conclusion
When we carefully study these outputs which produces from the three results, we can come to a conclusion that no matter where these three located, the static block calls first, then the empty block calls and finally the constructor calls.
Which simply means that the static block always executes when the class loader loads the class, so it executes first. Then among those empty block and constructor, the empty block calls when the object of the class is created and it calls before the constructor.
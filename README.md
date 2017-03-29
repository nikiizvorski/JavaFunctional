# JavaFunctional

Why is this project made? 

- Main reason is for people to understand how all of the changes in Java 1.8 are done and why, how they are going to have
to use them in future let say they are working as Android Developer soon Google will implement Functional as default.

Really important is to understand what Reduction is and what Recursion is!

Since we are getting away for imperative way of programming which is basically thinking and using Loops.

In Functional we use recursion , reduction and nested calls.

Okay what is Functional Programming in Java and how is it different from before?

0 - Main is that Java actually need this. Since functional programming is really easy to read, provided behavior as parameter also and 
to simplify parallel coding.

1 - First Functional Programming allow you to use Lambdas and Method References, Functional Interfaces which are interfaces that have
only one abstract method in them. You have to consider that method like equals are not counted since they use the Object class.

2 - Lambdas are anonymous functions which can only be used inside Functional interface.

3 - Method References is a way to short the expression the compiler will help you with that.

4 - Functional Interfaces have one abstract method, as many static as they need, and as many default methods.

5 - Default methods are the one that have implementation inside them and can be used directly.

6 - What do you have to learn in order for this to be easy for you?

- First main @FunctionalInterfaces that started this which are:

- Consumer<T> - single value no result.

- BiConsumer<T,U> - two values no result.

- Supplier - provides results.

- Function<T,R> - accept argument and returns a result.

- BiFunction<T,U,R> - accept two argument and return a result.

- BinaryOperator<T> - one parameter but returns two things of the same type. It is a form of BiFunction also called Acummulator. 
It is a special one so you should try to learn and use that as much as possible it is important. A good example would be:

- reduce() method which uses the accumulator to hold a partial result until searching for the next element true Reduction.

- Two parameters x, y (x) would be the parameter which will be the type returned every time but remember that is only partial result.

- Predicate - special version of function but return Boolean result.

- BiPredicate - takes two arguments.

- Predicates are really important they have couple methods and() , or(), then(), negate(), isEqual()

- Functional really shine here!

7 - Streams - Pipeline NxQ:

- What is the Pipeline? - it is a sequence of aggregate operations.

- What is Aggregate Operation? - it is made with lambdas wich provides behavior as parameter. So everytime you use
lambdas you are doing aggregate operation!

- Best prformance of the Pipeline you will get with the NxQ 

- N - data, Q - cost per elements

- ArrayList - perfect for parallel streams

- you will have to check yourself about which is good and bad when you need certain method for each type of stream!

[Source] -> [Intermediate Operation] -> [Terminal Operation] -> it can be [data collection] or [direct result]

- Intermediate Operation - those are made and used with Functional Interface that is why i told you first about the special interfaces
which are going to make things so easy in future for you!

- Intermediate Operation -> 

- filter[Predicate] - you already know what that is :)

- sorted[Comparator] - you already know what that is :)

- map[Function] - you already know what that is :)

- here is something important you would really have to consider

- handling Autoboxing/Unboxing data for better performance since Wrappers takes a lot of heap.

- here functional really shine with s couple awesome methogs:

- mapTo ( and all the boxed types ) trully awesome you will not have to handle anything else!

How does map() work?

- Input -> stream elements -> 1 to 1 -> Output

How does flatMap() work?

- Input -> stream elements -> 1 to 1 -> to many -> Output

- so you can have stream of streams using flatmap.

- you also have IntStream, DoubleStream, LongStream!

You probably already know these since you know that Map takes Function :)

- Terminal Operation ->

- collect() or printMsg or what ever you need but streams can be infinity or finity!

- You can also use method like peek() for debugging.

- Streams can be parallel or sequential. And can be transofmed very easy. But you have to know that the last one you perform 
would be the one that will come out as result.

- Don't forget to read a little more about reduction and recursion i pretty much explained what it is but would not hurt to do some work yourself! 
And avoid using forEach as much as possible since you will not be ding functional anymore. Loops are a no no.

- Recursion: some people say you wouldn't ever need to use it but i will give you an example:

- Recursion can be achieved by making an infnite loop let say calling a method and returning the same method over and over.

- But you can stop it at some point where yu need it! And that is a huge part of Functional programming.

- Android Example: let say you check for internet connection wouldn't it be great the method to keep checking until it is sure you have
a connection rather than being executed once and to stop? So you keep checking until you have connection. 
Most developers don't realise how good this is.

- Other Awesome thing about Functional is the Optional<T> Class a trully amazing class that will prevent you from 
making checks and loops all the time.

- From here you can continue with Reactive Programming which i think it i an extension of Functional since the Libraries are 
refactored and are currently using Functional as a base. And they work amazing!

Last would be all the examples inside the project. And please make sure you check the docs! There are a lot usefull methods
once you trully undestand how all of these work!

#### Author

- Niki Izvorski (nikiizvorski@gmail.com)

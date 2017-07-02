# ReaderMonadExample
This is exercise tried to implement https://www.youtube.com/watch?v=xPlsVVaMoB0&amp;list=PLNrgvgmcoFz24a7k2vtFLIPX1JI2V1pib

In traditional applications the higher level layer logic would be coupled to lower level layer. This is many problems. <br/>
The 2 important are <br/>


       1. Any change to the lower level layer affects all the other layers. 
       2. Service layer couldn't exist without the persistence layer(i.e., there is no mening to service layer without persistence  layer).
    
    
    
 <B>Important laws for Dependency Injection Principle </B>
 
 
        1. High level modules shouldn't depend on the low level modules. Both should depend on the abstractions.
        2. Abstractions shouldn't depend on details. Details should dpend on abstractions.
 
 
 
 
 <B> <h1> map - Functor properties </h1> <B> <br/>
 
        1. xs map identity == xs
        2. xs map (f) map (g) == xs map (x ==> g(f(x))
    
    
  <b> <h1> flatMap Monad Laws </h1> </b>
  
  
        1. List(x) flatMap f == f(x)
        2. xs flatMap(x => List(x)) == xs
        3. xs flatMap(f) flatMap(g) == xs.flatMap(f(_) flatMap(g))
        
        
   This repository consists of three projects <br/> 
       1. simpleReaderMonad <br>
       2. userRepository <br/>
       3. monadTransformers <br/>
       
       
   <B><h1> 1. simpleReaderMonad </h1> </B> <br/>  
       
       The author explains how the unary functions are composed using <i> andThen</i>. 
       
       The laws of the andThen function are 
       
       
              1. f andThen identity == f
              2. f andThen (g) andThen (h) == f. andThen (x => h(g(x)))
              
        Then he shows how unary functions can't be mapped using function `map` and how ReaderMonad is used to achieve the same.
        
   <B><h1> 2. userRepository </h1> </B> <br/>
       
       In this section author talks about how the how different components are injected using Reader monad.
       
       
   <B><h1> 3. monadTransformers </h1> </B> <br/>
       
  
       This is TODO section. I haven't implemented yet.
       

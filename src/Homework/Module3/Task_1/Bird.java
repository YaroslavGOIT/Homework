package Homework.Module3.Task_1;
 class Bird extends Animal{
     private static void sing() {
        System.out.println("I am flying");
        System.out.println("I am singing");
        System.out.println("I am Bird");
    }

     Bird() {
         Animal.walk();
         sing();
     }
 }

```mermaid
---
title: Animal example
---
classDiagram
    note "From Duck till Zebra"
    Animal <|-- Duck
    note for Duck "can fly\ncan swim\ncan dive\ncan help in debugging"
    Animal <|-- Fish
    Animal <|-- Zebra
    Animal : +int age
    Animal : +String gender
    Animal: +isMammal()
    Animal: +mate()
    class Duck{
        +String beakColor
        +swim()
        +quack()
    }
    class Fish{
        -int sizeInFeet
        -canEat()
    }
    class Zebra{
        +bool is_wild
        +run()
    }
```
classDiagram
  App "1" *-- "1..* BuildePizza : association
  class App{
    +main()
  }
  class BuilderPizza{
    +build()
  }
  BuilderPizza "1" *-- "1" Pizzas : associtaion
  class Pizzas {+Pizzas()}   

Gang of Four Design Patterns
Creational Patterns

1.Factory Method -- Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses. Clients does't have to get tied to the actual implementation

compoenents, 1. Abstract Creator -- has actual factory method..(interface/abstract class) 2. concreate Creator ... can take parameters,configs, based on that return one of products or create diff concrete cretor ech one for one ptroduct or use somekindof registry or mapping 3. Abstract product 4. concreteProduct

Examples,... Specified by architecture, implemented by user Examples: java.util.Calendar, java.util.ResourceBundle, java.text.NumberFormat
2.Abstract Factory
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.Implemented with a Factory, Hides the Factory, Abstracts Environment, Build through Composition Short definition: Factory of factories

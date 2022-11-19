# Java

## Entity Categories
| Entity Type | Description                                           |
| ----------- | ----------------------------------------------------- |
| [Package](entity/Package.md)     | Collect related Files                                 |
| [File](entity/File.md)        | The .java files which save the whole java information |
| [Class](entity/Class.md)       | Like a constructor of objects                         |
| [Enum](entity/Enum.md)        | Like a class only included fixed constants            |
| [Annotation](entity/Annotation.md)  | To get program information while running through it   |
| [AnnotationMember](entity/AnnotationMember.md)| Like a method, which provides extra actions about this annotation|
| [Interface](entity/Interface.md)   | A way to achieve Abstract in Java                     |
| [Method](entity/Method.md)      | To perform specific activity                          |
| [Module](entity/Module.md)      | A closely related set of packages and resources and a new module descriptor file|
| [Record](entity/Record.md)      | A restricted kind of class that defines a simple aggregate of values|
| [TypeParameter](entity/TypeParameter.md)| A container which stores type in generics            |
| [Variable](entity/Variable.md)    | A container which stores values                       |

## Relation Categories

| Dependency type | Description                                                  |
| --------------- | ------------------------------------------------------------ |
| [Import](relation/Import.md)          | A file imports other class, enum or package, or static imports method or var |
| [Inherit](relation/Inherit.md)         | A class inherits the other class                             |
| [Implement](relation/Implement.md)       | A class implement an interface                               |
| [Contain](relation/Contain.md)         | A package contains files, a file contain classes, enums and other types, etc |
| [Call](relation/Call.md)            | A method calls other methods                                 |
| [Parameter](relation/Parameter.md)       | A method needs parameters to use                             |
| [Typed](relation/Typed.md)           | A variable's type is one of the (self-defined) Class or other types                        |
| [UseVar](relation/UseVar.md)          | An entity uses a var in its scope, which could be a local var, a field or a parameter     |
| [Set](relation/Set.md)             | A method set some variables                                  |
| [Modify](relation/Modify.md)          | A method modify variables which have been set                |
| [Annotate](relation/Annotate.md)        | A annotation annotate entities                               |
| [Cast](relation/Cast.md)            | A method cast another type to a variable                     |
| [Override](relation/Override.md)        | A method which has the same name, return type and parameter type of the super method |
| [Reflect](relation/Reflect.md)         | A entity which call Class.forname("...") method to get a specific type. |
| [Define](relation/Define.md)          | A type define fields or methods, a method defines variables. |

## References

1. [Java Specification](https://docs.oracle.com/javase/specs/jls/se17/html/index.html), SE17

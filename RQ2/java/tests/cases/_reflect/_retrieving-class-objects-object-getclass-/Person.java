public class Person {
        private String name;
        private int age;
        private static String msg="hello world";
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public Person() {
        }
    
        private Person(String name) {
            this.name = name;
            System.out.println(age);
        }
    
        public void fun() {
            System.out.println("fun "+Person.msg);
        }
    
        public void fun(String name,int age) {
            System.out.println("我叫"+name+",今年"+age+"岁");
        }
    }
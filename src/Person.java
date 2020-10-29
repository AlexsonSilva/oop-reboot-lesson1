public class Person {

    private String name;

    private int age;

    public Person(String _name) {
        name = _name;
        System.out.println("Person is created");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int _age){
        if (_age < 0 || _age > 100){
           age = 0;
        }else {
            age = _age;
        }
        //Alternative method to simple if/else - knonw as ternary operator
       // age = _age < 0 || _age > 100 ? 0 : age;
    }
}

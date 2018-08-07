package Assignment4;

import java.io.Serializable;

public class Person implements Serializable {

    private String name ;
    private int id ;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void printDetails(){
        System.out.println("Name is: " + this.name);
        System.out.println("id is: " + this.id);
    }

    @Override
    public int hashCode() {
       // return super.hashCode();
        int x = id;  int z = 8;
        long hashCode = ((x + z) * z) * (x + z) / x;
        return (int)hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        Person employee = (Person) obj;
        if(this.id == employee.id)
            return true;
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person clonedObject = new Person();
        clonedObject.name = this.name;
        clonedObject.id = this.id;

        return clonedObject;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

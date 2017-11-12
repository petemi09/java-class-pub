package exercise6;

import java.util.Objects;


/**
 * Class Owl
 * @author yasiro01
 */
public class Owl {
    private String name;
    private Integer age;
    private String wisdom;
    
    public Owl(String name, Integer age){
        this.name = name;
        this.age = age;
        wisdom = "medium";
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.age);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Owl other = (Owl) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.wisdom, other.wisdom)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getWisdom() {
        return wisdom;
    }
    
    @Override
    public String toString() {
        return "Owl{" + "name=" + name + ", age=" + age + ", wisdom=" + wisdom + '}';
    }
}

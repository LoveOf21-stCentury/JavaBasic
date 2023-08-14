package Les6;

import java.util.List;
import java.util.Objects;

public class Cat {
    private String name;
    private String owner;
    private String breed;
    private int age;
    private List<String> healthHistory;

    public Cat(String name, String owner, String breed, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Котейка: " +
                "кликуха:'" + name + '\'' +
                ", хозяин:'" + owner + '\'' +
                ", породка:'" + breed + '\'' +
                ", годики=" + age +
                ", история болячек=" + healthHistory +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cat)) return false;
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && owner.equals(cat.owner) && breed.equals(cat.breed) && age == cat.age;
    }


    @Override
    public int hashCode(){
        return name.hashCode() + owner.hashCode() + breed.hashCode() + age;
    }

}

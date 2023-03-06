/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ssuniie
 */
public class Owner {

    protected final String name;
    protected Animal animal;

    public Owner() {
        this.name = "";
        this.animal = null;
    }

    public Owner(String name) {
        this.name = name;
        this.animal = null;
    }

    public Owner(Animal animal) {
        this.name = "";
        this.animal = animal;
    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void feedFood(Food f) {
        this.getAnimal().setPower(this.getAnimal().getPower() + f.getPower());
    }

    @Override
    public String toString() {
        Animal a = this.getAnimal();

        return String.format(
                "Owner : name = %s, Animal : name = %s, power = %d, age = %d",
                this.getName(), a.getName(), a.getPower(), a.getAge()
        );
    }

    public void protectOwnerFrom(Animal a) {
        if (this.getAnimal() instanceof Dog) {
            ((Dog) this.getAnimal()).kick(a);
        } else if (this.getAnimal() instanceof Pigeous) {
            ((Pigeous) this.getAnimal()).wingAttack(a);
        }
    }
}

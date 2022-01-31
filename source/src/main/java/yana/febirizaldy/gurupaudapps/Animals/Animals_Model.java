package yana.febirizaldy.gurupaudapps.Animals;

public class Animals_Model
{
    String animalName;
    String animal_Description;
    int animal_Image;
    int color;

    public Animals_Model()
    {

    }

    public Animals_Model(String ani_name, String ani_Description, int ani_Image, int ani_color)
    {
        this.animalName = ani_name;
        this.animal_Description = ani_Description;
        this.animal_Image = ani_Image;
        this.color = ani_color;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimal_Description() {
        return animal_Description;
    }

    public void setAnimal_Description(String animal_Description) {
        this.animal_Description = animal_Description;
    }

    public int getAnimal_Image() {
        return animal_Image;
    }

    public void setAnimal_Image(int animal_Image) {
        this.animal_Image = animal_Image;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

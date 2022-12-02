package ru.hozhasaitov.entities.npc;

public abstract class Person {
    private String name;
    private int healPoints;
    private int currentGold;
    private int dexterity;
    private int experience;
    private int strange;

    public Person(String name, int healPoints, int currentGold, int dexterity, int experience, int strange) {
        this.name = name;
        this.healPoints = healPoints;
        this.currentGold = currentGold;
        this.dexterity = dexterity;
        this.experience = experience;
        this.strange = strange;
    }

    public String getName() {
        return name;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public int getCurrentGold() {
        return currentGold;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getExperience() {
        return experience;
    }

    public int getStrange() {
        return strange;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void setCurrentGold(int currentGold) {
        this.currentGold = currentGold;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void battleCry();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(name).append('\'');
        sb.append(", ХП=").append(healPoints);
        sb.append(", Голда=").append(currentGold);
        sb.append(", Ловкость=").append(dexterity);
        sb.append(", Опыт=").append(experience);
        sb.append(", Сила=").append(strange);
        sb.append('.');
        return sb.toString();
    }
}

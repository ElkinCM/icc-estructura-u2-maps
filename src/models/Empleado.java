package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int compareTo(Empleado otro) {
        return Integer.compare(this.id, otro.id); // Orden por ID
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Empleado)) return false;
        Empleado e = (Empleado) obj;
        return id == e.id && name.equals(e.name) && position.equals(e.position);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + name.hashCode();
        result = 31 * result + position.hashCode();
        return result;
    }
}

package DAO;
import models.Empleado;

public interface EmpleadoDAO {
    public void add(Empleado empleado);

    public void remove(int id);

    public void list();
}

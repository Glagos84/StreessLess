package cl.mind.streessless2.models;

import com.orm.SugarRecord;

/**
 * Created by Gabriel on 15-08-2017.
 */

public class Pending extends SugarRecord {

    private String name, descripcion;
    boolean done;

    public Pending() {
    }

    public Pending(String name, String descripcion, boolean done) {
        this.name = name;
        this.descripcion = descripcion;
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}

package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobFields {
    protected int id;
    protected static  int nextid = 1;
    protected String value;

    public JobFields(){
        id = nextid;
        nextid++;
    }
    public JobFields(String value){
        this();
        this.value=value;
    }
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}

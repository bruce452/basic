package design_pattern._3_prototype.deepCopy;

import java.io.Serializable;

public class Deep implements Cloneable, Serializable {
    private String name;
    private String classname;

    public Deep(String name, String classname) {
        this.name = name;
        this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}

package design_pattern._8_combination;

import com.sun.corba.se.spi.activation.ORBAlreadyRegistered;

/**
 * 组合模式   抽象部分
 */
public abstract class Organization {
    private String name;
    private String des;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Organization(String name, String des) {
        this.name = name;
        this.des = des;
    }


    /**
     *  叶子不需要实现，抽象中提供默认实现
     */
    public void add(){
        throw new UnsupportedOperationException();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

    /**
     * 子类打印自己的信息
     */
    public abstract void print();

}

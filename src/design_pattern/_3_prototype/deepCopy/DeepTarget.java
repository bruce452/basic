package design_pattern._3_prototype.deepCopy;

import java.io.*;

public class DeepTarget implements Cloneable, Serializable {

    private String deep1;
    private String deep2;
    private Deep deep;

    public Deep getDeep() {
        return deep;
    }

    public void setDeep(Deep deep) {
        this.deep = deep;
    }

    public DeepTarget(String deep1, String deep2, Deep deep) {
        this.deep1 = deep1;
        this.deep2 = deep2;
        this.deep = deep;
    }

    public String getDeep1() {
        return deep1;
    }

    public void setDeep1(String deep1) {
        this.deep1 = deep1;
    }

    public String getDeep2() {
        return deep2;
    }

    public void setDeep2(String deep2) {
        this.deep2 = deep2;
    }

    @Override
    public String toString() {
        return "DeepTarget{" +
                "deep1='" + deep1 + '\'' +
                ", deep2='" + deep2 + '\'' +
                ", deep=[name=" + deep.getName() +",classname="+deep.getClassname()+
                "]}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepTarget deepTarget=null;
        deepTarget= (DeepTarget) super.clone();    //主类的拷贝
        deepTarget.deep= (Deep) this.deep.clone();  //主类成员变量的拷贝赋给主类的成员变量

        return deepTarget;
    }


    private Object deepclone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;

        //序列化
        bos=new ByteArrayOutputStream();
        oos=new ObjectOutputStream(bos);
        oos.writeObject(this);  // 当前对象以对象流的方式输出

        //反序列化
        bis=new ByteArrayInputStream(bos.toByteArray());
        ois=new ObjectInputStream(bis);
        return ois.readObject();
    }

    public static void cloneMethod() throws CloneNotSupportedException {
        DeepTarget deepTarget=new DeepTarget("aaa","bbb",new Deep("deep","deep111"));
        DeepTarget deepTarget1= (DeepTarget) deepTarget.clone();
        DeepTarget deepTarget2= (DeepTarget) deepTarget.clone();
        DeepTarget deepTarget3= (DeepTarget) deepTarget.clone();
        DeepTarget deepTarget4= (DeepTarget) deepTarget.clone();
        System.out.println(deepTarget1+",deephash="+deepTarget1.getDeep().hashCode());
        System.out.println(deepTarget2+",deephash="+deepTarget2.getDeep().hashCode());
        System.out.println(deepTarget3+",deephash="+deepTarget3.getDeep().hashCode());
        System.out.println(deepTarget4+",deephash="+deepTarget4.getDeep().hashCode());
    }

    public static void seriesMethod() throws IOException, ClassNotFoundException {
        DeepTarget deepTarget=new DeepTarget("aaa","bbb",new Deep("deep","deep111"));

        DeepTarget deepTarget1= (DeepTarget) deepTarget.deepclone();
        DeepTarget deepTarget2= (DeepTarget) deepTarget.deepclone();
        DeepTarget deepTarget3= (DeepTarget) deepTarget.deepclone();

        System.out.println(deepTarget+",deephash="+deepTarget.getDeep().hashCode());
        System.out.println(deepTarget1+",deephash="+deepTarget1.getDeep().hashCode());
        System.out.println(deepTarget2+",deephash="+deepTarget2.getDeep().hashCode());
        System.out.println(deepTarget3+",deephash="+deepTarget3.getDeep().hashCode());
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        seriesMethod();
        System.out.println("====================");
        cloneMethod();

    }


}


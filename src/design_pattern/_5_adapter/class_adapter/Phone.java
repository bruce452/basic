package design_pattern._5_adapter.class_adapter;

public class Phone {
    public void charging(VolAdapter volAdapter){
        if(volAdapter.change220_to5v()==5){
            System.out.println("调用适配器成功");
        }else{
            System.out.println("未适配220v，到5v");
        }
    }
}

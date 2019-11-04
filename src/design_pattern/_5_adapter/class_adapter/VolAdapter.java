package design_pattern._5_adapter.class_adapter;

public class VolAdapter extends Vol220 implements IVol5v {

    @Override
    public int change220_to5v() {
        int v = get220V();
        return v/44;
    }
}

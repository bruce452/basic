package design_pattern._5_adapter.instance_adapter;

public class VolAdapter implements IVol5v{
    private Vol220 vol220v;

    public VolAdapter(Vol220 vol220v) {
        this.vol220v = vol220v;
    }

    @Override
    public int change220_to5v() {
        int v = vol220v.get220V();
        return v/44;
    }
}

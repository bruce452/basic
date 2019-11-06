package design_pattern._8_combination;

import java.util.ArrayList;
import java.util.List;

public class College extends Organization{
    List<Organization> organizationList=new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    public void add(Organization organization){
        organizationList.add(organization);
    }

    public void remove(Organization organization){
        organizationList.remove(organization);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        System.out.println("============"+getName()+"==============");
        for(Organization organization:organizationList){
            organization.print();
        }
    }

}

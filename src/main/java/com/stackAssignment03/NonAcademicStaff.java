package com.stackAssignment03;

import com.stackAssignment03.enums.Gender;
import com.stackAssignment03.enums.Role;

import java.util.ArrayList;
import java.util.List;

public class NonAcademicStaff extends Staff{
    private List<Role> roles;

    public NonAcademicStaff(String name, int id, Gender gender, int age, double salary) {
        super(name, id, gender, age, salary);
        roles = new ArrayList<>();
    }

    public List<Role> getRoles() {
        return roles;
    }



    public void addRole(Role responsibility){
        if(!roles.contains(responsibility)){
            roles.add(responsibility);
            System.out.println("Role successfully added to " + getName() + " with ID #" + getId());
        }else
            System.out.println("Role already exist!!");
    }

    public void removeRole(Role responsibility){
        if(roles.contains(responsibility)){
            roles.remove(responsibility);
            System.out.println("\nRole successfully removed from " + getName() + " with ID #" + getId());
        }else
            System.out.println(getName() + " does not have such responsibility");
    }

    public void displayRoles(){
        if(roles.isEmpty())
            System.out.println(getName() + " currently does not have any responsibility");
        else {
            System.out.println("\nRoles of " + getName() + " with ID #" + getId() );
            int i = 1;
            for(Role role : roles) {
                System.out.println(i + ". " + role);
                i++;
            }
        }

    }

}

package com.stackAssignment03;

import com.stackAssignment03.enums.Gender;
import com.stackAssignment03.enums.Role;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NonAcademicStaffTest {
    @Test
    void addRole_Success() {
        NonAcademicStaff staff = new NonAcademicStaff("John Smith", 301, Gender.MALE, 25, 25000);
        Role role = Role.CLERK;
        staff.addRole(role);

        List<Role> roles = staff.getRoles();

        assertTrue(roles.size() == 1, "Role should be added");
        assertEquals(role, roles.get(0), "Added role should match");
    }

    @Test
    void addRole_AlreadyAdded_Failure() {
        NonAcademicStaff staff = new NonAcademicStaff("Jane Doe", 302, Gender.FEMALE, 45, 30000);
        Role role = Role.SECRETARY;
        staff.addRole(role);
        staff.addRole(role);

        List<Role> roles = staff.getRoles();
        assertEquals(1, roles.size(), "Role should not be added again");
    }

    @Test
    void removeRole_ExistingRole_Success() {
        NonAcademicStaff staff = new NonAcademicStaff("John Smith", 301, Gender.MALE, 25, 56000);
        Role role = Role.Administrative_ASSISTANCE;
        staff.addRole(role);

        staff.removeRole(role);

        List<Role> roles = staff.getRoles();

        assertTrue(roles.isEmpty(), "Role should be removed");
    }

    @Test
    void removeRole_NonExistingRole_Failure() {
        NonAcademicStaff staff = new NonAcademicStaff("Jane Doe", 302, Gender.FEMALE, 32, 70000);

        Role role = Role.LAB_ATTENDANT;
        staff.removeRole(role);
        List<Role> roles = staff.getRoles();

        assertTrue(roles.isEmpty(), "No role should be removed as it does not exist");
    }

}
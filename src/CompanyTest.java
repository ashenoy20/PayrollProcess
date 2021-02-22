import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Profile profile;
    Employee employee;
    Company company;

    @BeforeEach
    void setUp() {
        profile = new Profile("Over,Bend","CS", new Date());
        employee = new Employee(profile);
        company = new Company();
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertTrue(company.add(employee));
        assertFalse(company.add(employee));
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void setHours() {
    }
}

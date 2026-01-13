package test.ems_backend.Mapper;
import test.ems_backend.dto.EmployeeDto;
import test.ems_backend.entity.Employee;

public class EmployeeMapper {
    
    public static EmployeeDto maptoEmployeedto(Employee employee) {
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstname(),
            employee.getLastname(),
            employee.getEmail()
        );
    }

    public static Employee maptoEmployee(EmployeeDto dto) {
        return new Employee(
            dto.getId(),
            dto.getFirstname(),
            dto.getLastname(),
            dto.getEmail()
        );
    }
}
package test.ems_backend.Mapper;
import test.ems_backend.dto.EmployeeDto;
import test.ems_backend.entity.Employee;

public class EmployeeMapper {
    
    public static EmployeeDto toDto(Employee employee) {
        if (employee == null) {
            return null;
        }
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setFirstname(employee.getFirstname());
        dto.setLastname(employee.getLastname());
        dto.setEmail(employee.getEmail());
        return dto;
    }

    public static Employee toEntity(EmployeeDto dto) {
        if (dto == null) {
            return null;
        }
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setFirstname(dto.getFirstname());
        employee.setLastname(dto.getLastname());
        employee.setEmail(dto.getEmail());
        return employee;
    }
}
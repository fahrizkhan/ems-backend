package test.ems_backend.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import test.ems_backend.dto.EmployeeDto;
import test.ems_backend.entity.Employee;
import test.ems_backend.repository.EmployeeRepository;
import test.ems_backend.service.EmployeeService;
import test.ems_backend.Mapper.EmployeeMapper;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.toEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.toDto(savedEmployee);
        }
    
}

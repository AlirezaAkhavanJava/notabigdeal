package Streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private List<String> projects;
}

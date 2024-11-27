package lk.ijse.tdm;

import lk.ijse.entity.Program;
import lk.ijse.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class RegistrationTM {
    private int regId;
    private Student student;
    private Program program;
    private Date registrationDate;
    private double paidAmount;
}

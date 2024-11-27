package lk.ijse.bo.custom;

import javafx.collections.ObservableList;
import lk.ijse.bo.SuperBo;
import lk.ijse.dto.PaymentDTO;
import lk.ijse.dto.RegistrationDTO;
import lk.ijse.tdm.RegistrationTM;

public interface RegistrationBO extends SuperBo {
    String genarateNewId();

    boolean saveRegistration(RegistrationDTO registrationDTO, PaymentDTO paymentDTO);

    ObservableList<RegistrationTM> getAllRegistrations();
}

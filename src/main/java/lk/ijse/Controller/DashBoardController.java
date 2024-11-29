package lk.ijse.Controller;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class DashBoardController {
    public AnchorPane rootNode;
    public Label lblDate;

    public void initialize(){
        lblDate.setText(LocalDate.now().toString());
    }
}

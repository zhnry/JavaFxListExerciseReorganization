/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package populatelist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class FXMLDocumentController implements Initializable {
  
  @FXML
  private Label label;
  @FXML
  private Button button;
  @FXML
  private ListView<?> lvPeople;
  @FXML
  private TextField tfFirstName;
  @FXML
  private TextField tfLastName;
  @FXML
  private Button btnAddPerson;
  
  @FXML
  private void handleButtonAction(ActionEvent event) {
    System.out.println("You clicked me!");
    label.setText("Hello World!");
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void handleBtnAddPersonClicked(MouseEvent event) {
    System.out.println("First name" + tfFirstName.getText());
    System.out.println("Last name" + tfLastName.getText());
  }
  
}

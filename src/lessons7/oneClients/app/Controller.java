package lessons7.oneClients.app;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import lessons6.server.EchoServer;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends View implements Initializable {

    @FXML
    private TextArea output_text;
    @FXML
    private TextField write_text;
    @FXML
    private Button send_Button;


    Button bt=new Button();

    public void initialize(URL location, ResourceBundle resources) {
    }

    private Model model = new Model();

    EchoServer echoServer = new EchoServer();

    private void go() {

        model.setButton(send_Button);
        model.setTextArea(output_text);
        model.setTextField(write_text);
        model.send();

    }


    public void send(ActionEvent actionEvent) {

        this.go();
    }

}


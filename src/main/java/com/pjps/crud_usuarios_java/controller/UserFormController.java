package com.pjps.crud_usuarios_java.controller;


import com.pjps.crud_usuarios_java.model.Usuario;
import com.pjps.crud_usuarios_java.service.UsuarioService;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserFormController {
    @FXML
    private Label titleLable;
    @FXML
    private TextField nomeField;
    @FXML
    private TextField sobrenome;
    @FXML
    private TextField emailField;
    @FXML
    private TextField loginField;
    @FXML
    private TextField telefoneField;
    @FXML
    private DatePicker dataNascimentoPicker;
    @FXML
    private ChoiceBox<String> sexoChoiceBox;
    @FXML
    private TextField enderecoField;

    private Stage stage;
    private Usuario usuario;
    private UsuarioService usuarioService;

    public void initialize() {

    }

    public void setStage() {

    }

    public void setUsuario() {

    }

    @FXML
    public void handleSalvar() {

    }
}
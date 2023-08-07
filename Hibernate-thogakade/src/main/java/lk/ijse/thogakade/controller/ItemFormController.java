package lk.ijse.thogakade.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.thogakade.entity.Item;
import lk.ijse.thogakade.repository.ItemRepository;

import java.io.IOException;
import java.sql.SQLException;

public class ItemFormController {
    @FXML
    private TableColumn<?, ?> colAction;

    @FXML
    private TableColumn<?, ?> colCode;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colQtyOnHand;
    @FXML
    private AnchorPane root;
    @FXML
    private TextField txtCode;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtQtyOnHand;

    @FXML
    private TextField txtUnitPrice;


    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/dashboard_form.fxml"));

        Stage stage = (Stage) root.getScene().getWindow();
        stage.setTitle("Dashboard");
        stage.setScene(new Scene(parent));
        stage.centerOnScreen();
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
//        String code = txtCode.getText();
//        try {
//            boolean isDeleted = ItemModel.delete(code);
//            if(isDeleted) {
//                new Alert(Alert.AlertType.CONFIRMATION, "deleted!").show();
//            }
//        } catch (SQLException e) {
//            new Alert(Alert.AlertType.ERROR, "something went wrong!").show();
//        }
    }

    @FXML
    void btnGetAllOnAction(ActionEvent event) {


    }

    @FXML
    void btnSaveOnAction(ActionEvent event) throws SQLException {
        Item item=getItem();
        ItemRepository itemRepository=new ItemRepository();

        int savedCusId=itemRepository.saveItem(item);
        System.out.println("Saved customer id:" + savedCusId);
    }

    private Item getItem() {
        Item  item=new Item();
//        item.setId(txtId.getText());
        item.setDescription(txtDescription.getText());
        item.setUnitPrice(Double.valueOf(txtUnitPrice.getText()));
        item.setQtyOnHand(txtQtyOnHand.getText());

        return item;
    }

//        String code = txtCode.getText();
//        String description = txtDescription.getText();
//        double unitPrice = Double.parseDouble(txtUnitPrice.getText());
//        int qtyOnHand = Integer.parseInt(txtQtyOnHand.getText());
//
//        boolean isSaved = ItemModel.save(code, description, unitPrice, qtyOnHand);
//        if(isSaved) {
//            new Alert(Alert.AlertType.CONFIRMATION, "Item saved!").show();
//        }


    @FXML
    void btnUpdateOnAction(ActionEvent event) {
//        String code = txtCode.getText();
//        String description = txtDescription.getText();
//        double unitPrice = Double.parseDouble(txtUnitPrice.getText());
//        int qtyOnHand = Integer.parseInt(txtQtyOnHand.getText());
//
//        try {
//            boolean isUpdated = ItemModel.update(code, description, unitPrice, qtyOnHand);
//            new Alert(Alert.AlertType.CONFIRMATION, "Item updated!").show();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            new Alert(Alert.AlertType.ERROR, "something went wrong!").show();
//        }
    }

    @FXML
    void codeSearchOnAction(ActionEvent event) {

    }
}

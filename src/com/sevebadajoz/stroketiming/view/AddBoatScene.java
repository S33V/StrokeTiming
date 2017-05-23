package com.sevebadajoz.stroketiming.view;

import com.sevebadajoz.stroketiming.model.Boat;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddBoatScene {
    // TODO: 5/22/2017 Add make and seat number functionality
    @FXML
    Button mBackButton;
    @FXML
    TextField mBoatName;
    @FXML
    TextField mBoatType;
    @FXML
    TextField mBoatWeight;
    @FXML
    Button mAddButton;

    @FXML
    Object addBoat() {
        String name = mBoatName.getText();
        String boatType = mBoatType.getText();
        String weight = mBoatWeight.getText().trim();
        if (weight.equals("")) {
            BoatListScene.getBoatList().getItems().add(new Boat(name, 8, boatType));
        } else {
            BoatListScene.getBoatList().getItems().add(new Boat(name, 8, Integer.parseInt(weight), ""));
        }
        ViewSwitch.loadScene("Stroke Timing", ViewSwitch.BOAT_LIST_SCENE);
        return this;
    }

    @FXML
    Object back() {
        clear();
        ViewSwitch.loadScene("Stroke Timing", ViewSwitch.BOAT_LIST_SCENE);
        return this;
    }

    @FXML
    Object clear() {
        mBoatName.setText("");
        mBoatType.setText("");
        mBoatWeight.setText("");
        return this;
    }
}
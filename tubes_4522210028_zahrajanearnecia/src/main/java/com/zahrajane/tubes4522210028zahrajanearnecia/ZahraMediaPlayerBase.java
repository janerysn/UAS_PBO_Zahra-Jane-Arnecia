package com.zahrajane.tubes4522210028zahrajanearnecia;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.scene.Scene;
import javafx.util.Duration;

import java.io.File;

public abstract class ZahraMediaPlayerBase implements MediaPlayerControl {

    @FXML
    protected Button btnPlay;

    @FXML
    protected Label lblDuration;

    @FXML
    protected MediaView mediaView;

    @FXML
    protected Slider zahraslider;

    protected Media zahrajanemedia;
    protected MediaPlayer zahrajanemediaplayer;

    protected boolean zahraisPlay = false;



    @FXML
    public void selectMedia() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Zahra Select Media");
        File zahraselectedFile = fileChooser.showOpenDialog(null);

        if (zahraselectedFile != null) {
            String url = zahraselectedFile.toURI().toString();
            initializeMediaPlayer(url);
        }
    }

    @Override
    public void initializeMediaPlayer(String mediaUrl) {
        zahrajanemedia = new Media(mediaUrl);
        zahrajanemediaplayer = new MediaPlayer(zahrajanemedia);

        mediaView.setMediaPlayer(zahrajanemediaplayer);

        zahrajanemediaplayer.currentTimeProperty().addListener(((observableValue, oldValue, newValue) -> {
            zahraslider.setValue(newValue.toSeconds());
            lblDuration.setText("Duration: " + (int) zahraslider.getValue() + " / " + (int) zahrajanemedia.getDuration().toSeconds());
        }));

        zahrajanemediaplayer.setOnReady(() -> {
            Duration zahratotalDuration = zahrajanemedia.getDuration();
            zahraslider.setMax(zahratotalDuration.toSeconds());
            lblDuration.setText("Duration: 00 / " + (int) zahrajanemedia.getDuration().toSeconds());
        });

        Scene zahrascene = mediaView.getScene();
        mediaView.fitWidthProperty().bind(zahrascene.widthProperty());
        mediaView.fitHeightProperty().bind(zahrascene.heightProperty());
    }
}

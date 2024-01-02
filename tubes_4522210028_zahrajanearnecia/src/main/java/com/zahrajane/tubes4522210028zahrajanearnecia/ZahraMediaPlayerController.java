package com.zahrajane.tubes4522210028zahrajanearnecia;


import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.stage.FileChooser;
import javafx.util.Duration;

import java.io.File;

public class ZahraMediaPlayerController extends ZahraMediaPlayerBase {

    @Override
    public void playButtonClicked(MouseEvent event) {
        if (!zahraisPlay) {
            btnPlay.setText("Pause");
            zahrajanemediaplayer.play();
            zahraisPlay = true;
        } else {
            btnPlay.setText("Play");
            zahrajanemediaplayer.pause();
            zahraisPlay = false;
        }
    }

    @Override
    public void stopButtonClicked(MouseEvent event) {
        btnPlay.setText("Play");
        zahrajanemediaplayer.stop();
        zahraisPlay = false;
    }

    @Override
    public void sliderPressed(MouseEvent event) {
        zahrajanemediaplayer.seek(Duration.seconds(zahraslider.getValue()));
    }

    @Override
    public void selectMedia() {
        String mediaUrl = chooseMediaFile();

        if (mediaUrl != null) {
            initializeMediaPlayer(mediaUrl);
        }
    }


    private String chooseMediaFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Zahra Select Media");
        File zahrajaneselectedFile = fileChooser.showOpenDialog(null);

        if (zahrajaneselectedFile != null) {
            return zahrajaneselectedFile.toURI().toString();
        }

        return null;
    }

    @FXML
    protected void btnPlay(MouseEvent event) {
        if (!zahraisPlay) {
            btnPlay.setText("Pause");
            zahrajanemediaplayer.play();
            zahraisPlay = true;
        } else {
            btnPlay.setText("Play");
            zahrajanemediaplayer.pause();
            zahraisPlay = false;
        }
    }

    @FXML
    protected void btnStop(MouseEvent event) {
        btnPlay.setText("Play");
        zahrajanemediaplayer.stop();
        zahraisPlay = false;
    }

}

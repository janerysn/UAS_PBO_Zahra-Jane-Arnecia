package com.zahrajane.tubes4522210028zahrajanearnecia;

import javafx.scene.input.MouseEvent;

public interface MediaPlayerControl {

    void playButtonClicked(MouseEvent event);

    void stopButtonClicked(MouseEvent event);

    void sliderPressed(MouseEvent event);

    void selectMedia();

    void initializeMediaPlayer(String mediaUrl);

}

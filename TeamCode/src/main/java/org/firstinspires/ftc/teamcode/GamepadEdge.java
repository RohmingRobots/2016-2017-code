package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;

/**
 * Created by ablauch on 11/3/2017.
 */

public class GamepadEdge extends Gamepad {

    private Gamepad mygamepad = null;
    private boolean a_state = false;
    boolean a_pressed = false;
    boolean a_released = false;

    /* Constructor */
    public GamepadEdge(Gamepad agamepad) {
        mygamepad = agamepad;
        a_state = mygamepad.a;
    }

    /* Call this method when you want to update the detection of the button edges pressed/released */
    public void UpdateEdge() {
        /* check if button has just been pressed */
        if (mygamepad.a && !a_state)        a_pressed = true;
        else                                a_pressed = false;
        if (!mygamepad.a && a_state)        a_released = true;
        else                                a_released = false;
        a_state = mygamepad.a;
    }
}

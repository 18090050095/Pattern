package com.coderjj.facadepattern.product;

import com.coderjj.facadepattern.camera.Camera;
import com.coderjj.facadepattern.camera.SamsungCamera;
import com.coderjj.facadepattern.phone.Phone;
import com.coderjj.facadepattern.phone.PhoneImpl;

/**
 * Created by Administrator on 2019/4/16.
 */

public class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new SamsungCamera();

    public void dail() {
        mPhone.dail();
    }

    public void videoChat() {
        mCamera.open();
        mPhone.dail();
    }

    public void hangUp() {
        mPhone.hangUp();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera() {
        mCamera.close();
    }
}

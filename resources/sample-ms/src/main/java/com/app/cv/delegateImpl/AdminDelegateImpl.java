package com.app.cv.delegateImpl;

import com.app.cv.api.AdminApiDelegate;
import com.app.cv.model.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Service
public class AdminDelegateImpl implements AdminApiDelegate {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return AdminApiDelegate.super.getRequest();
    }

    @Override
    public ResponseEntity<Admin> getAdminDetails() {
        System.out.println("getAdminDetails()");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

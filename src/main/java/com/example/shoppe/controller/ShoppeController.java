package com.example.shoppe.controller;

import com.example.shoppe.model.entity.Profile;
import com.example.shoppe.model.entity.User;
import com.example.shoppe.model.request.ProfileRequest;
import com.example.shoppe.model.request.UserRequest;
import com.example.shoppe.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.shoppe.service.IProfileService;

@RestController
@RequestMapping("shoppe")
public class ShoppeController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IProfileService iProfileService;

    @PostMapping("/profile/create")
    ResponseEntity<Profile> create(@RequestBody ProfileRequest request) {
        Profile profile = iProfileService.create(request);
        return ResponseEntity.ok(profile);
    }

    @PostMapping("/user")
    ResponseEntity<User> cre(@RequestBody UserRequest userRequest) {
        User user = iUserService.create(userRequest);
        return ResponseEntity.ok(user);
    }


}

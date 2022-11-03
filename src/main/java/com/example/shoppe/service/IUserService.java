package com.example.shoppe.service;

import com.example.shoppe.model.entity.User;
import com.example.shoppe.model.request.UserRequest;

public interface IUserService {
    User create(UserRequest userRequest);

}

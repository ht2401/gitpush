package com.example.shoppe.service;

import com.example.shoppe.model.entity.Profile;
import com.example.shoppe.model.request.ProfileRequest;
import com.example.shoppe.model.response.UploadFileResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IProfileService {
    List<Profile> getAll();
    Profile create(ProfileRequest request);
    UploadFileResponse upload(MultipartFile file, Long id) throws  Exception;
}

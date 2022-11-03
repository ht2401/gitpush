package com.example.shoppe.service;

import com.example.shoppe.model.entity.Profile;
import com.example.shoppe.model.request.ProfileRequest;
import com.example.shoppe.model.response.UploadFileResponse;
import com.example.shoppe.repository.ProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class ProfileService implements IProfileService{
    @Autowired
    private ProfileRepository repository;

    @Override
    public List<Profile> getAll() {
        return null;
    }

    @Override
    public Profile create(ProfileRequest request) {
            Profile profile = new Profile();
            profile.setFullName(request.getFullName());
            profile.setDateOfBirth(request.getDateOfBirth());
            profile.setAvatarUrl(request.getAvatarUrl());
            profile.setEmail(request.getEmail());
            profile.setUserId(request.getUserId());
            profile.setCreatedAt(LocalDate.now());
            profile.setUpdatedAt(LocalDate.now());
            repository.save(profile);
            return profile;
    }

    @Override
    public UploadFileResponse upload(MultipartFile file, Long id) throws Exception {
        return null;
    }
}

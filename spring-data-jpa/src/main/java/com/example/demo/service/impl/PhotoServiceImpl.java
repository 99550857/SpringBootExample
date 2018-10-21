package com.example.demo.service.impl;


import com.example.demo.dao.PhotoRepository;
import com.example.demo.entity.Photo;
import com.example.demo.service.PhotoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PhotoServiceImpl implements PhotoService {
    @Resource
    PhotoRepository photoRepository;

    @Override
    public void addPhoto(Photo photo) {
        photoRepository.save(photo);
    }
}

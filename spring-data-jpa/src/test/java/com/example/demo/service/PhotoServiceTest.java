package com.example.demo.service;

import com.example.demo.entity.Album;
import com.example.demo.entity.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PhotoServiceTest {
    @Resource
    PhotoService photoService;

    @Test
    public void addPhoto() {
        Album album = new Album();
        album.setId(1);
        Photo photo = new Photo("http://img2.imgtn.bdimg.com/it/u=114139281,1353799337&fm=27&gp=0.jpg", album);
        photoService.addPhoto(photo);
    }
}
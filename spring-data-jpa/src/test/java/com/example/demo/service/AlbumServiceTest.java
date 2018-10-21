package com.example.demo.service;

import com.example.demo.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;


@SpringBootTest
@RunWith(SpringRunner.class)
public class AlbumServiceTest {
    @Resource
    AlbumService albumService;

    @Test
    public void getDESCHotAlbum() {
        albumService.getDESCHotAlbum().forEach(System.out::println);
    }

    @Test
    public void setData() {

    }
}
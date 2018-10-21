package com.example.demo.controller;

import com.example.demo.entity.Album;
import com.example.demo.service.AlbumService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;

    @GetMapping("/list")
    public List<Album> getHotAlbum() {

        return albumService.getDESCHotAlbum();

    }
}

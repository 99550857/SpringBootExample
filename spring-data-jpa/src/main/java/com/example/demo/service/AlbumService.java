package com.example.demo.service;

import com.example.demo.entity.Album;

import java.util.List;

public interface AlbumService {

    List<Album> getDESCHotAlbum();

    void setData(Album album);
}

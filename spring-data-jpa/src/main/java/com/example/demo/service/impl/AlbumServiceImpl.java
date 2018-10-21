package com.example.demo.service.impl;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.entity.Album;
import com.example.demo.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository;

    @Override
    public List<Album> getDESCHotAlbum() {
        return albumRepository.findHotAlbue();
    }

    @Override
    public void setData(Album album) {
        albumRepository.save(album);
    }
}

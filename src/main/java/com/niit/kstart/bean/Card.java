package com.niit.kstart.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by 99550 on 2018/9/10.
 */
@Data

public class Card {
    private String avatar;
    private String name;
    private String title;
    private String content;
    private String cover;
    private Integer collectionNumber;
    private Integer commentNumber;

    public Card(String avatar, String name, String title, String content, String cover, Integer collectionNumber, Integer commentNumber) {
        this.avatar = avatar;
        this.name = name;
        this.title = title;
        this.content = content;
        this.cover = cover;
        this.collectionNumber = collectionNumber;
        this.commentNumber = commentNumber;
    }
}

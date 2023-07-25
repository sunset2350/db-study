package com.tje.controller.post;


// Get /posts
// 게시글 목록이 JSON으로 나오게

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Post {
    private long no;
    private String title;
    private String content;
    private String creatorName;
    private String createdTime;


}

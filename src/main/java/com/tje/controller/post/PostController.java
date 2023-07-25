package com.tje.controller.post;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping(value = "/posts")
public class PostController {
    Map<Integer, Post> map = new ConcurrentHashMap<>();












    @GetMapping
    public List<Post> getList() {
        map.clear();
        map.put(1, Post.builder()
                .title("1제목")
                .content("2")
                .no(1)
                .creatorName("park")
                .createdTime(new Date().toString())
                .build());

        map.put(2, Post.builder()
                .title("2제목")
                .content("1")
                .no(2)
                .creatorName("chan")
                .createdTime(new Date().toString())
                .build());

        var list = new ArrayList<>(map.values());
        // 람다식(lambda expression)
        // 식이 1개인 함수식;
        // 매개변수 영역과 함수 본체를 화살표로 구분함
        // 함수 본체의 수식 값이 반환값

        list.sort((a,b)-> (int)(b.getNo() - a.getNo()));
        return list;
    }
}

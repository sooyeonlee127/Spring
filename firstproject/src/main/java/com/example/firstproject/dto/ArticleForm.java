package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // <생성자> 대신 : 롬복
@ToString // <ToString 메서드> 대신: 롬복
public class ArticleForm {
    private String title;
    private String content;

    // <생성자>
//    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
    // <toString 메서드>
//    @Override
//    public String toString() {
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}

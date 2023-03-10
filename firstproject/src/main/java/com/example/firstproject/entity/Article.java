package com.example.firstproject.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능하게 함
@AllArgsConstructor // 생성자 대체
@NoArgsConstructor // 디폴트 생성자를 추가
@ToString // tostring 대체
@Getter // getId 위해서 붙임!!
public class Article {

    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue // 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;



    // 생성자 -> 롬복으로 대체
//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }

    // toString -> 롬복으로 대체
//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }


}

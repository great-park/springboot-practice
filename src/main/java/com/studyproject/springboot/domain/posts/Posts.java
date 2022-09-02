package com.studyproject.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity //테이블과 링크될 클래스.
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false) //@Column 어노테이션이 없어도 자동으로 됨. 설정이 필요한 경우에 붙인다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    /**
     *빌더도 생성자처럼 생성 시점에 값을 채워준다.
     * 생성자는 지금 채워야 할 필드가 무엇인지 정확히 지정할 수 없다.
     * 빌더를 사용하면 어느 필드에 어떤 값을 채워야 할지 명확하다.
     * Example.builder()
     *      .a(a)
     *      .b(b)
     *      .build();
     */
    @Builder //해당 클래스의 빌더 패턴 클래스를 생성, 생성자 상단에 선언 시 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

package zyno.zyno_spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // JPA 스펙 상, public 또는 protected 기본 생성자 필요
    public Member() {
    }


    public Member(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    // 보통 ID는 생성 시 자동 할당되므로, setter는 제거하거나,
    // protected로 두기도 함
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

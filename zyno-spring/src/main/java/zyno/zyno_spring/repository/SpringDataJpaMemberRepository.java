package zyno.zyno_spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import zyno.zyno_spring.domain.Member;

public interface SpringDataJpaMemberRepository
    extends JpaRepository<Member, Long>, MemberRepository {

  @Override
  Optional<Member> findByName(String name);

}

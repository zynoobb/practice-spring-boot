import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import zyno.zyno_spring.repository.MemberRepository;
import zyno.zyno_spring.service.MemberService;

@Configuration // 설정 class 명시
public class SpringConfig {
  private final MemberRepository memberRepository;

  public SpringConfig(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  @Bean
  public MemberService memberService() {
    return new MemberService(memberRepository);
  }

  // @Bean
  // private MemberRepository memberRepository() {
  // // return new JdbcTemplateMemberRepository(dataSource);
  // return new JpaMemberRepository(em);
  // }
}

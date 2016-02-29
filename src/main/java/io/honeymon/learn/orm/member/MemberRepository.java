package io.honeymon.learn.orm.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Repository로 설정
public interface MemberRepository extends JpaRepository<Member, Long> {

	Member findById(Long id);
	
	Member findByName(String name);
	
	Member findByNameAndEmail(String name, String email);
	
}

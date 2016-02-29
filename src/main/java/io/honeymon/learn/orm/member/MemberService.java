package io.honeymon.learn.orm.member;

/**
 * {@link Member} 에 대한 서비스를 관리하는 인터페이스
 * 
 * @author jhpark
 *
 */
public interface MemberService {

	/**
	 * Save or Update {@link Member}
	 * 
	 * @param member
	 * @return
	 */
	Member save(Member member);

	/**
	 * Delete {@link Member}
	 * 
	 * @param member
	 */
	void delete(Member member);

	/**
	 * Fine {@link Member} by {@link Member#getId()}
	 * 
	 * @param id
	 * @return
	 */
	Member findId(Long id);
}

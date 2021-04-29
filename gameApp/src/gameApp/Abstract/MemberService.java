package gameApp.Abstract;

import gameApp.Entities.Member;

public interface MemberService {
	
	void add(Member member);
	void update(Member member);
	void delete(Member member);

}

package gameApp.Abstract;

import gameApp.Entities.Member;

public abstract class BaseMemberManager implements MemberService{

	public void add(Member member) {
		System.out.println("�ye veri taban�na eklendi. " + member.getFirstName());
	}
	public void update(Member member) {
		System.out.println("�ye g�ncellendi " + member.getFirstName());
	}
	public void delete(Member member) {
		System.out.println("�ye silindi " + member.getFirstName());
	}
}

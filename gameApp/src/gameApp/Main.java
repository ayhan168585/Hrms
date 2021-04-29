package gameApp;

import java.util.Random;

import gameApp.Abstract.BaseMemberManager;
import gameApp.Abstract.BaseSellManager;
import gameApp.Abstract.MemberCheckService;
import gameApp.Concrete.CampaignManager;
import gameApp.Concrete.CampaignSellManager;
import gameApp.Concrete.GameManager;
import gameApp.Concrete.MemberManager;
import gameApp.Concrete.NormalSellManager;
import gameApp.Concrete.SellManager;
import gameApp.Entities.Campaign;
import gameApp.Entities.Game;
import gameApp.Entities.Member;

public class Main {

	public static void main(String[] args) {
		
	BaseMemberManager memberManager=new MemberManager(new MemberCheckService() {
		
		@Override
		public boolean CheckIfRealPerson(Member member) {
			Random r=new Random();
			int sayi=r.nextInt(3);
			if(sayi==1) {
				return false;
			}
			else {
				return true;
			}
		}
	});
			
		
		Member member1=new Member();
		member1.setId(1);
		member1.setFirstName("Ayhan");
		member1.setLastName("Özer");
		member1.setEmail("ayhan@ayhan.com");
		
		memberManager.add(member1);
		memberManager.update(member1);
		memberManager.delete(member1);
		System.out.println("-----------------------------------------------------------------");
		
		Game game1=new Game();
		game1.setId(1);
		game1.setGameName("FixBuss simulator");
		game1.setPrice(100);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		System.out.println("-------------------------------------------------------------------");
		Campaign campaign=new Campaign();
		
		campaign.setId(1);
		campaign.setCampaignName("Arayýl tatili kampanyasý");
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		System.out.println("---------------------------------------------------------------------");
		
		BaseSellManager sellManager=new NormalSellManager();
		sellManager.sell(member1, game1,campaign);
		BaseSellManager sellManager2=new CampaignSellManager();
		sellManager2.sell(member1, game1,campaign);
		System.out.println("--------------------------------------------------------------------");

	}

}

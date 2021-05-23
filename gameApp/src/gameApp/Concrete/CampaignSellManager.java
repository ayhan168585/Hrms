package gameApp.Concrete;

import gameApp.Abstract.BaseSellManager;
import gameApp.Entities.Campaign;
import gameApp.Entities.Game;
import gameApp.Entities.Member;

public class CampaignSellManager extends BaseSellManager {
	
	public void sell(Member member, Game game,Campaign campaign) {
		System.out.println("oyun �yeye kampanya yolu ile sat�ld� "+ "Kampanya ad�: " + campaign.getCampaignName()+" " +"�ye ad�:"+  member.getFirstName() +" "+ "Oyun ad�:"+ game.getGameName()+
				" "+"Kazan�lan para:" + game.getPrice()*0.8);
		
	}


}

package gameApp.Concrete;

import gameApp.Abstract.BaseSellManager;
import gameApp.Entities.Campaign;
import gameApp.Entities.Game;
import gameApp.Entities.Member;

public class CampaignSellManager extends BaseSellManager {
	
	public void sell(Member member, Game game,Campaign campaign) {
		System.out.println("oyun üyeye kampanya yolu ile satýldý "+ "Kampanya adý: " + campaign.getCampaignName()+" " +"Üye adý:"+  member.getFirstName() +" "+ "Oyun adý:"+ game.getGameName()+
				" "+"Kazanýlan para:" + game.getPrice()*0.8);
		
	}


}

package gameApp.Concrete;

import gameApp.Abstract.BaseSellManager;
import gameApp.Abstract.SellService;
import gameApp.Entities.Campaign;
import gameApp.Entities.Game;
import gameApp.Entities.Member;

public class NormalSellManager extends BaseSellManager {

	@Override
	public void sell(Member member, Game game,Campaign campaign) {
		System.out.println("oyun üyeye satýldý " +"Üye adý:"+  member.getFirstName() +" "+ "Oyun adý:"+ game.getGameName()+
				" "+"Kazanýlan para:" + game.getPrice());
		
	}

}

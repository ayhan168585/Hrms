package gameApp.Abstract;

import gameApp.Entities.Campaign;
import gameApp.Entities.Game;
import gameApp.Entities.Member;

public abstract class BaseSellManager implements SellService {

	public void sell(Member member, Game game,Campaign campaign) {
		System.out.println("oyun üyeye satýldý " +"Üye adý:"+  member.getFirstName() +" "+ "Oyun adý:"+ game.getGameName()+
				" "+"Kazanýlan para:" + game.getPrice());
		
	}
}

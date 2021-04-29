package gameApp.Abstract;

import gameApp.Entities.Campaign;
import gameApp.Entities.Game;
import gameApp.Entities.Member;

public interface SellService {
	
	void sell(Member member,Game game,Campaign campaign);

}

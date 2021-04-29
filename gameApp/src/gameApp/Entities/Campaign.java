package gameApp.Entities;

public class Campaign extends CampaignEntity {
	
	private String campaignName;

	public Campaign() {
		
	}

	public Campaign(String campaignName) {
		
		this.campaignName = campaignName;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

}

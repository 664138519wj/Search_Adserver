package admanager.ranking;

import java.util.List;

import admanager.budget.BudgetManager;
import admanager.entity.Advertisement;
import database.AdDBHelper;

public class AdsRanker {

	public static void rankingAds(List<Advertisement> adList, String adCall){
		String userid = adCall.split(",")[0].split(":")[1];
		for (Advertisement ad: adList){
			String ad_query = userid+"&"+ad.getId()+"&"+"0";
//			double score = AdsRankingHandler.getInstance().ranking(ad_query);
//			ad.setScore(score);
			ad.setScore(.5);
		}
	}
	

	
	public static void main(String[] args){
		
		
		return;
	}
}

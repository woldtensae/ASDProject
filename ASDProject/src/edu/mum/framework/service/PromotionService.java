package edu.mum.framework.service;

import java.util.List;

import edu.mum.framework.domain.APromotion;

public interface PromotionService {
	public void savePromotion(APromotion promotion);
	public void deletePromotion(APromotion promotiony);
	public void updateCategor(APromotion promotion);
	public APromotion findOnePromotionCode(String id);
	public List<APromotion> findAllPromotion();
}

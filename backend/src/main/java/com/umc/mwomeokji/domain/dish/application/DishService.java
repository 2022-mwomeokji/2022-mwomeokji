package com.umc.mwomeokji.domain.dish.application;

import com.umc.mwomeokji.domain.dish.dto.DishDto.*;

import java.util.List;

public interface DishService {

    List<DishesNameResponse> getAllDishesName();

    DishDetailsResponse getDishDetails(Long id);
}

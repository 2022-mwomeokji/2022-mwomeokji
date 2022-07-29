package com.umc.mwomeokji.domain.dish.api;

import com.umc.mwomeokji.domain.dish.application.DishService;
import com.umc.mwomeokji.domain.dish.dto.DishDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DishController.class)
class DishControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DishService dishService;

    @DisplayName("모든 메뉴 이름 조회")
    @Test
    void get_all_dishes_name() throws Exception {
        // given
        DishDto.DishesNameResponse dishesNameResponse1 = new DishDto.DishesNameResponse(1L, "초밥");
        DishDto.DishesNameResponse dishesNameResponse2 = new DishDto.DishesNameResponse(2L, "냉면");
        List<DishDto.DishesNameResponse> dishesNameResponseList = Stream.of(dishesNameResponse1, dishesNameResponse1).collect(Collectors.toList());
        given(dishService.getAllDishesName()).willReturn(dishesNameResponseList);

        // when, then
        mockMvc.perform(get("/dishes/name"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value(dishesNameResponse1.getName()))
                .andExpect(jsonPath("$[1].name").value(dishesNameResponse2.getName()))
                .andDo(print());
        verify(dishService, atMostOnce()).getAllDishesName();
    }

    @DisplayName("메뉴 상세 정보 조회 - 성공")
    @Test
    void get_dish_details() {

    }
}
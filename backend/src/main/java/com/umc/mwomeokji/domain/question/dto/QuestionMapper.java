package com.umc.mwomeokji.domain.question.dto;

import com.umc.mwomeokji.domain.question.domain.Question;
import org.mapstruct.Mapper;
import com.umc.mwomeokji.domain.question.dto.QuestionDto.*;

@Mapper
public class QuestionMapper {

    QuestionsNameResponse toQuestionNameResponse(Question question);

    QuestionAndDishsResponse toQuestionDishsResponse(Question question);
}

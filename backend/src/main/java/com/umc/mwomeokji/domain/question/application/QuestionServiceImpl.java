package com.umc.mwomeokji.domain.question.application;

import com.umc.mwomeokji.domain.question.dao.QuestionRepository;
import com.umc.mwomeokji.domain.question.domain.Question;
import com.umc.mwomeokji.domain.question.dto.QuestionDto.QuestionAndDishsResponse;
import com.umc.mwomeokji.domain.question.dto.QuestionDto.QuestionsNameResponse;
import com.umc.mwomeokji.domain.question.dto.QuestionMapper;
import com.umc.mwomeokji.domain.question.exception.NotFoundQuestionException;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional
@Service
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    @Override
    @Transactional(readOnly = true)
    public List<QuestionsNameResponse> getAllQuestionsName(){
        List<Question> questionList = questionRepository.findAll();
        return questionList.stream().map(question -> questionMapper.toQuestionNameResponse(dish)).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List
}

package com.lilac.service.impl;

import com.lilac.mapper.AnswerMapper;
import com.lilac.pojo.Answer;
import com.lilac.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public List<Answer> findByCommentId(Integer id) {
        List<Answer> answers = answerMapper.findByCommentId(id);
        return answers;
    }

    @Override
    public int addAnswer(Answer answer) {
        int i = answerMapper.addAnswer(answer);
        return i;
    }

    @Override
    public int addAnswers(Answer answer) {
        int i = answerMapper.addAnswers(answer);
        return i;
    }

    @Override
    public Answer findById(Integer id) {
        Answer answer = answerMapper.findById(id);
        return answer;
    }

}

package com.ccq.dataprovider.brushQuestions.controller;


import com.ccq.dataprovider.brushQuestions.vo.Option;
import com.ccq.dataprovider.brushQuestions.vo.Question;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ccq
 * @Date: 2021-02-25 15:59
 * @Version v1.0.0
 */
@RestController
@RequestMapping("/api/questions")
public class QuestionsController {

    @PostMapping("/list/{level}/{questionType}")
    public List<Question> questionList(@PathVariable String level, @PathVariable String questionType){
        System.out.println(level);
        System.out.println(questionType);
        List<Question> list = new ArrayList<>();
        Question question = null;

        for (int i = 1; i <=20; i++) {

            question = new Question(
                    "question question question question"+i,
                    "solution solution solution solution solution "+i, false);
            Option option = null;
            for (int i1 = 1; i1 <=4; i1++) {
                option = new Option(String.valueOf(i1), "第"+i+"Option"+i1,i1==2?true:false);
                question.getOptions().add(option);
            }
            list.add(question);
        }

        return list;
    }
}

package com.education.content.service;

import com.education.content.model.dto.SaveTeachplanDto;
import com.education.content.model.dto.TeachplanDto;

import java.util.List;

public interface TeachplanService {

/**
 * @description 查询课程计划树型结构
 * @param courseId  课程id
 * @return List<TeachplanDto>
 * @author Mr.M
 * @date 2022/9/9 11:13
*/
 public List<TeachplanDto> findTeachplanTree(long courseId);
 public void saveTeachplan(SaveTeachplanDto saveTeachplanDto);

 }

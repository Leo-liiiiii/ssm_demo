package com.ujiuye.ssm.service.impl;

import com.ujiuye.ssm.mapper.GirlMapper;
import com.ujiuye.ssm.pojo.Girl;
import com.ujiuye.ssm.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LiLe
 * @create 2020-08-17 19:07
 */
@Service
@Transactional
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlMapper girlMapper;
    @Override
    public List<Girl> findAll() {

        return girlMapper.findAll();
    }
}

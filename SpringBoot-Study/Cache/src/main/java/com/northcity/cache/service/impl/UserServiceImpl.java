package com.northcity.cache.service.impl;

import com.northcity.cache.entity.User;
import com.northcity.cache.repository.UserRepository;
import com.northcity.cache.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository repository;

    @Autowired
    RedisTemplate redisTemplate;

    //查询数据库后 数据添加到缓存
    @Override
    @Cacheable(cacheNames = "cacheManager", key = "'User:'+ #id")
//    @Cacheable(key = "'User:'+ #id")
    public User getUser(Integer id) {
//        Map<String,String> d = new HashMap<>();
//        d.put("a","aa");
//        redisTemplate.opsForHash().putAll("ss",d);
//        redisTemplate.opsForValue().set("tt","sjdbds");
        return repository.getUser(id);
    }

    //清除一条缓存，key为要清空的数据
    @Override
    @CacheEvict(cacheNames = "cacheManager", key = "'USER:'+#id")
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }

    //修改数据后更新缓存
    @Override
    @CachePut(cacheNames = "cacheManager", key = "'USER:'+#updateUser.id", unless = "#result == null")
    public User updateUser(User updateUser) {
        return repository.save(updateUser);
    }


}
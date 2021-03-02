package com.example.demoTwitter.service;

import com.example.demoTwitter.model.Tweet;

import com.example.demoTwitter.model.User;
import com.example.demoTwitter.repo.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    public List<Tweet> findAll(){
        List<Tweet> tweets = tweetRepository.findAllByOrderByCreatedAtDesc();
        return tweets;
    }

    public List<Tweet> findAllByUser(User user){
        List<Tweet> tweets = tweetRepository.findAllByUserOrderByCreatedAtDesc(user);
        return tweets;
    }
    public List<Tweet> findAllByUsers(List<User> users){
        List<Tweet> tweets = tweetRepository.findAllByUserInOrderByCreatedAtDesc(users);
        return tweets;
    }

    public void save(Tweet tweet){
        tweetRepository.save(tweet);
    }

}

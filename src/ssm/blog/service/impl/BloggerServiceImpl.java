package ssm.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.blog.dao.BloggerDao;
import ssm.blog.entity.Blogger;
import ssm.blog.service.BloggerService;
//博主service实现类
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

	@Resource
	private BloggerDao bloggerDao;
	@Override
	//根据用户名查询博主信息，用于登录
	public Blogger getByUsername(String username) {
		return bloggerDao.getByUsername(username);
	}

	@Override
	//获取博主信息
	public Blogger getBloggerData() {
		return bloggerDao.getBloggerData();
	}

	@Override
	public Integer updateBlogger(Blogger blogger) {
		return bloggerDao.updateBlogger(blogger);
	}

}

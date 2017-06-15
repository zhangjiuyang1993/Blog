package ssm.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.blog.dao.BloggerDao;
import ssm.blog.entity.Blogger;
import ssm.blog.service.BloggerService;
//����serviceʵ����
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

	@Resource
	private BloggerDao bloggerDao;
	@Override
	//�����û�����ѯ������Ϣ�����ڵ�¼
	public Blogger getByUsername(String username) {
		return bloggerDao.getByUsername(username);
	}

	@Override
	//��ȡ������Ϣ
	public Blogger getBloggerData() {
		return bloggerDao.getBloggerData();
	}

	@Override
	public Integer updateBlogger(Blogger blogger) {
		return bloggerDao.updateBlogger(blogger);
	}

}

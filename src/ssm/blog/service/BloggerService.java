package ssm.blog.service;

import ssm.blog.entity.Blogger;

//����service�ӿ�
public interface BloggerService {

	public Blogger getByUsername(String username);
	
	public Blogger getBloggerData();
	
	//���²���������Ϣ
	public Integer updateBlogger(Blogger blogger);
}

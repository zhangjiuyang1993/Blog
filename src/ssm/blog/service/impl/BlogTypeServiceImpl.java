package ssm.blog.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.blog.dao.BlogTypeDao;
import ssm.blog.entity.BlogType;
import ssm.blog.service.BlogTypeService;
//博客类别service实现类
@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {

	@Resource
	private BlogTypeDao blogTypeDao;
	@Override
	//获取博客类别信息
	public List<BlogType> getBlogTypeData() {
		return blogTypeDao.getBlogTypeData();
	}

	@Override
	public List<BlogType> listBlogType(Map<String, Object> map) {
		return blogTypeDao.listBlogType(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return blogTypeDao.getTotal(map);
	}

	@Override
	public Integer addBlogType(BlogType blogType) {
		return blogTypeDao.addBlogType(blogType);
	}

	@Override
	public Integer updateBlogType(BlogType blogType) {
		return blogTypeDao.updateBlogType(blogType);
	}

	@Override
	public Integer deleteBlogType(Integer id) {
		return blogTypeDao.deleteBlogType(id);
	}

}

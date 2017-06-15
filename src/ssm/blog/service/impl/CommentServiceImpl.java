package ssm.blog.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.blog.dao.CommentDao;
import ssm.blog.entity.Comment;
import ssm.blog.service.CommentService;
//用户评论service实现类
@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Resource
	private CommentDao commentDao;
	@Override
	public List<Comment> getCommentData(Map<String, Object> map) {
		return commentDao.getCommentData(map);
	}

	@Override
	public int addComment(Comment comment) {
		return commentDao.addComment(comment);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return commentDao.getTotal(map);
	}

	@Override
	public Integer update(Comment comment) {
		return commentDao.update(comment);
	}

	@Override
	public Integer deleteComment(Integer id) {
		return commentDao.deleteComment(id);
	}

	@Override
	public Integer deleteCommentByBlogId(Integer blogId) {
		return commentDao.deleteCommentByBlogId(blogId);
	}

}

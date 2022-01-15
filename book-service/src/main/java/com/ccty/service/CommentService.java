package com.ccty.service;


import com.ccty.bo.CommentBO;
import com.ccty.pojo.Comment;
import com.ccty.utils.PagedGridResult;
import com.ccty.vo.CommentVO;

public interface CommentService {

    /**
     * 发表评论
     */
    public CommentVO createComment(CommentBO commentBO);

    /**
     * 查询评论的列表
     */
    public PagedGridResult queryVlogComments(String vlogId,
                                             String userId,
                                             Integer page,
                                             Integer pageSize);

    /**
     * 删除评论
     */
    public void deleteComment(String commentUserId,
                              String commentId,
                              String vlogId);

    /**
     * 根据主键查询comment
     */
    public Comment getComment(String id);
}

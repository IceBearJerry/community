package com.nowcoder.community.util;

public interface CommunityConstant {
    /**
     * 激活成功
     */
    int ACTVATION_SUCCESS = 0;
    /**
     * 重复激活
     */
    int ACTVATION_REPEAT = 1;
    /**
     * 激活失败
     */
    int ACTVATION_FAILURE = 2;
    /**
     * 默认超时时间
     */
    int DEFAULT_EXPIRED_TIME = 3600 * 12;
    /**
     * 记住状态下超时
     */
    int REMEMBERED_DEFAULT_EXPIRED_TIME = 3600 * 24 * 100;

    /**
     * 实体类型：帖子
     */
    int ENTITY_TYPE_POST = 1;

    /**
     * 实体类型：评论
     */
    int ENTITY_TYPE_COMMENT = 2;


    /**
     * 实体类型：用户
     */
    int ENTITY_TYPE_USER = 3;

    /**
     * 主题: 评论
     */
    String TOPIC_COMMENT = "comment";

    /**
     * 主题: 点赞
     */
    String TOPIC_LIKE = "like";

    /**
     * 主题: 关注
     */
    String TOPIC_FOLLOW = "follow";

    /**
     * 主题: 发帖
     */
    String TOPIC_PUBLISH = "publish";


    /**
     * 系统用户ID
     */
    int SYSTEM_USER_ID = 1;

    /**
     * 权限: 普通用户
     */
    String AUTHORITY_USER = "user";

    /**
     * 权限: 管理员
     */
    String AUTHORITY_ADMIN = "admin";

    /**
     * 权限: 版主
     */
    String AUTHORITY_MODERATOR = "moderator";



}
# GraduationProject

### 1. 用户管理功能：
用户注册：允许用户创建账户。
用户登录：提供登录功能，确保用户身份的合法性。
用户个人信息管理：用户可以编辑个人资料、更改密码等。
用户头像上传：允许用户上传个人头像。
用户角色和权限管理：定义用户角色，分配不同的权限。
个人主页：显示用户的帖子、评论、关注等信息。
---
### 2. 帖子管理功能：
发表帖子：用户可以发布新的帖子，包括标题和内容。
编辑帖子：用户可以编辑已发布的帖子内容。
删除帖子：用户或管理员可以删除帖子。
帖子列表：显示所有帖子的列表，支持分页。
帖子详情：查看帖子的详细内容和评论。
精华帖子：管理员可以设置某些帖子为精华，突出显示。
---
### 3. 评论功能：
发表评论：用户可以在帖子下发表评论。
回复评论：用户可以回复其他用户的评论。
删除评论：用户或管理员可以删除评论。
评论点赞：用户可以给评论点赞。
---
### 4. 用户权限管理功能：
用户角色定义：定义用户的角色，如普通用户、管理员、付费会员等。
角色权限关联：将角色与相应的权限关联，用于控制用户的操作权限。
付费会员管理：管理员可以管理付费会员，包括续费、升级等。
---
### 5. 板块分类功能：
创建板块：管理员可以创建不同主题或分类的板块。
查看板块：用户可以查看不同板块下的帖子列表。
---
### 6. 搜索功能：
关键字搜索：用户可以通过关键字搜索帖子或用户。
高级搜索：提供更多搜索选项，如按发布时间、作者等筛选。
---
### 7. 通知功能：
系统通知：系统可以向用户发送一些重要的通知，如新的私信、帖子回复等。
消息通知：用户可以接收有关个人的通知，如新关注、新回复等。
---
### 8. 个人消息功能：
私信功能：用户之间可以发送私信。
消息盒子：用户可以查看和管理接收到的私信。
---
### 9. 点赞和收藏功能：
点赞帖子或评论：用户可以给喜欢的帖子或评论点赞。
收藏帖子：用户可以收藏自己喜欢的帖子。
---
### 10. 举报和投诉功能：
用户可以举报违规内容或用户，以便管理员进行处理。
提供用户投诉系统，用户可以提交有关其他用户或内容的投诉。
---
### 11. 付费用户功能：
会员等级：设置不同的会员等级，每个等级对应不同的服务或权限。
会员费用：设定每个会员等级的费用，并提供不同的付费周期。
会员特权：付费用户可以享有特殊的服务和功能。
---
### 12. 社交互动功能：
关注和被关注：用户可以关注其他用户，查看关注者的帖子。
好友系统：用户可以添加其他用户为好友，进行私信交流。
用户排行榜：显示用户的积分、活跃度等排名。
---
### 13. 安全性功能：
HTTPS加密：使用HTTPS协议保障数据传输的安全性。
防御机制：防止恶意攻击，如SQL注入、XSS攻击等。
用户隐私保护：严格管理用户数据，保护用户隐私。
---
### 14. 统计和分析功能：
论坛数据统计：统计用户数量、帖子数量、回复数量等。
用户活跃度分析：分析用户的活跃度和行为。
帖子热度分析：统计帖子的阅读量、点赞数等。
---
### 15. 管理员功能：
用户管理：管理员可以管理用户，包括禁用账号、解封账号等。
内容审核：管理员可以审核和管理帖子、评论等内容。
权限管理：管理员可以修改用户的角色和权限。
数据备份和恢复：定期进行数据库备份，以防数据丢失。
---

# sql脚本
---
### 创建用户管理相关表
CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL COMMENT '用户名',
    password VARCHAR(255) NOT NULL COMMENT '密码',
    email VARCHAR(255) COMMENT '电子邮件',
    avatar_url VARCHAR(255) COMMENT '用户头像URL',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='用户表';

CREATE TABLE user_role (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL COMMENT '角色名称',
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='用户角色表';

CREATE TABLE user_user_role (
    user_id BIGINT COMMENT '用户ID',
    role_id BIGINT COMMENT '角色ID',
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (role_id) REFERENCES user_role(id),
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='用户与角色关联表';

#### 创建帖子管理相关表
CREATE TABLE forum_post (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL COMMENT '帖子标题',
    content TEXT COMMENT '帖子内容',
    user_id BIGINT COMMENT '发布用户ID',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='帖子表';

CREATE TABLE comment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    content TEXT COMMENT '评论内容',
    user_id BIGINT COMMENT '评论用户ID',
    post_id BIGINT COMMENT '关联帖子ID',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='评论表';

#### 创建权限管理相关表
CREATE TABLE permission (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL COMMENT '权限名称',
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='权限表';

CREATE TABLE role_permission (
    role_id BIGINT COMMENT '角色ID',
    permission_id BIGINT COMMENT '权限ID',
    PRIMARY KEY (role_id, permission_id),
    FOREIGN KEY (role_id) REFERENCES user_role(id),
    FOREIGN KEY (permission_id) REFERENCES permission(id),
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='角色与权限关联表';

#### 创建付费用户相关表
CREATE TABLE membership_level (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL COMMENT '会员等级名称',
    description TEXT COMMENT '会员等级描述',
    price DECIMAL(10, 2) NOT NULL COMMENT '会员价格',
    duration INT COMMENT '会员时长（天）',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='会员等级表';

CREATE TABLE user_payment_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT COMMENT '用户ID',
    membership_level_id BIGINT COMMENT '关联会员等级ID',
    payment_amount DECIMAL(10, 2) NOT NULL COMMENT '支付金额',
    payment_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '支付时间',
    expiry_date TIMESTAMP COMMENT '会员过期时间',
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (membership_level_id) REFERENCES membership_level(id),
    is_deleted CHAR(1) DEFAULT '0' COMMENT '逻辑删除标志: 0-未删除, 1-已删除'
) COMMENT='用户付费记录表';


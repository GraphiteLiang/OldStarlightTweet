# StarlightTweet
我尝试建立推特搬运网站（包括但不限于starlight相关的声优推特），也算是学习网页后端的一个小实践，欢迎交流
这个项目只是本人在学习spring与springboot的过程中用来练手的项目
如果有人愿意真正去做这个项目可以直接去做，没问题的
version1.2更新：添加了搜索功能，目前只支持搜索推特id，下一步准备支持选定想要的属性进行搜索
version1.3更新：1.添加了数据库连接，可能看不出改变，但实现了author头像的逻辑。\n
2.目前存在一个问题，由于使用了@ManyToOne @JoinColumn(name="authorid")导致tweet类中没有了authorid属性，所以无法通过findByAuthorid来获取tweet了，故两个超链接目前无法使用。
3.现在当我开启服务器就可以通过外网访问了。

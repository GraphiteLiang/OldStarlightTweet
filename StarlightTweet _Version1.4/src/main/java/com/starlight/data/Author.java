package com.starlight.data;

import java.util.List;

import javax.persistence.*;

@Entity// 说明这是一个和数据库表映射的实体类
@Table(name = "author")
public class Author {
	@Id
	private Long id;
	private String name;
	private String project;
	@Lob
	@Basic(fetch=FetchType.LAZY)
	@Column(name="icon",columnDefinition="longblob",nullable=true)
	private byte[] icon;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "author")
	private List<Tweet> tweets;
	public Author() {
		super();
	}
	public Author(Long id, String name,String project, byte[] icon) {
		this.id=id;this.name=name;this.project=project;this.icon=icon;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getProject() {
		return project;
	}
	public byte[] getIcon() {
		return icon;
	}
}

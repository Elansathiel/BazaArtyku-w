package utils;

import models.Article;
import models.ArticleFx;

public class ConverterArticle {

	public static Article convertArticleFxToArticle(ArticleFx articleFx) {
		Article article =new Article();
		article.setId(articleFx.getId());
		article.setName(articleFx.getName());
		article.setSurName(articleFx.getSurname());
		article.setTitle(articleFx.getTitle());	
		return article;
	}
	
	public static ArticleFx convertToArticleFx(Article article) {
		ArticleFx articleFx=new ArticleFx();
		articleFx.setId(article.getId());
		articleFx.setName(article.getName());
		articleFx.setSurname(article.getSurName());
		articleFx.setTitle(article.getTitle());
		
		return articleFx;
	}
}

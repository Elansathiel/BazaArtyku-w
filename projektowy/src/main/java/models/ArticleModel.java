package models;


import java.util.List;

import dao.ArticleDao;
import dbutils.DbManager;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utils.ApplicationException;
import utils.ConverterArticle;

public class ArticleModel {
  
	private ObjectProperty<ArticleFx> articleFxObjectProperty=new SimpleObjectProperty(new ArticleFx());
	private ObservableList<ArticleFx> articleFxObservableList=FXCollections.observableArrayList(); 
	
	public void init() throws ApplicationException {
		ArticleDao articleDao=new ArticleDao(DbManager.getConnectionSource());
		List<Article> articleList=articleDao.queryForAll(Article.class);
		this.articleFxObservableList.clear();
		articleList.forEach(article->{
			ArticleFx articleFx=ConverterArticle.convertToArticleFx(article);
			
			this.articleFxObservableList.add(articleFx);
		});
		DbManager.closeConnectionSource();
	}
	
	public void saveArticleInDataBase() throws ApplicationException {
		ArticleDao articleDao=new ArticleDao(DbManager.getConnectionSource());
		
		Article article=ConverterArticle.convertArticleFxToArticle(this.getArticleFxObjectProperty());
		
		articleDao.creatOrUpdate(article);
		DbManager.closeConnectionSource();
		this.init();
	}
	
	public ArticleFx getArticleFxObjectProperty() {
		return articleFxObjectProperty.get();
	}
	public ObjectProperty<ArticleFx> articleFxObjectProperty() {
		return articleFxObjectProperty;
	}

	public void setArticleFxObjectProperty(ObjectProperty<ArticleFx> articleFxObjectProperty) {
		this.articleFxObjectProperty = articleFxObjectProperty;
	}

	public ObservableList<ArticleFx> getArticleFxObservableList(){
		return articleFxObservableList;
	}
	
	public void setArticleFxObservableList(ObservableList<ArticleFx> articleFxObservableList) {
		this.articleFxObservableList = articleFxObservableList;
	}
	
}

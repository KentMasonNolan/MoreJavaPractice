package Week5;

public class Book {

	private String title;
	private String authors;

	@Override
	public String toString()
	{
		return this.getTitle()+" by "+this.getAuthors();
	}

	public Book(String title,String athors)
	{
		this.setTitle(title);
		this.setAuthors(athors);
	}
	
	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}
	

	public String getAuthors() 
	{
		return authors;
	}

	public void setAuthors(String authors) 
	{
		this.authors = authors;
	}




}

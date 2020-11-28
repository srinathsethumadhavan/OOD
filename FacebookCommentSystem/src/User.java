
public class User {

	private String id;
	private String name;
	 
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void addCommentToPost(Post p, Comment c) {
	
		c.setPostId(p.getId());
		p.setComments(c);
		
	}

	public void replyToComment(Post p, Comment c, Comment cx) {
		
		cx.setPostId(p.getId());
		p.setThreadComments(c,cx);
	}
	

	public void deleteComment(Post p,Comment c) {
		p.deleteComment(c);
	}
	
	public void editComment(Post p,Comment c,String description) {
		p.editComment(c,description);
	}

	public void deleteThreadedComment(Post p, Comment c, Comment cx) {
		p.deleteThreadedComment(c,cx);
		
	}
	
	
}

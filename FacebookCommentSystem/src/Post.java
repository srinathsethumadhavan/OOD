import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Post {
	
private String id ;
private List<Comment> comments;
private Map<Comment,List<Comment>> threadedComments;
	public Post(String id) {
		this.comments = new ArrayList<>();
		this.threadedComments= new HashMap<>();
		this.id = id;
	}

	

	public String getId() {
		return id;
	}

	
	public List<Comment> getComments() {
		return comments;
	}

	
	public void setComments(Comment c) {
		comments.add(c);
		threadedComments.put(c, new ArrayList<>());
	}



	public void setThreadComments(Comment c, Comment cx) {
		cx.setParentId(c.getCommentId());
		
		threadedComments.get(c).add(cx);
		
	}
	
	public List<Comment> getThreadedComments(Comment c){
		List<Comment> threadedCommentsList = threadedComments.get(c);
		return threadedCommentsList;
	}



	public void deleteComment(Comment c) {
		comments.remove(c);
		threadedComments.remove(c);	
	}



	public void editComment(Comment c, String description) {
	c.setDescription(description);
		
	}



	public void deleteThreadedComment(Comment c, Comment cx) {
		
		threadedComments.get(c).remove(cx);
	}
	
	
}

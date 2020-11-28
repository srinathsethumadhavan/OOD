
public class Comment {

	private String id;
	private String postId;
	
	private String parentId;
	private String description;
	
	
	public Comment(String id,String description) {
		super();
		this.id= id;
		this.description = description;
		this.parentId=null;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getCommentId() {
		return id;
	}
	public void setCommentId(String commentId) {
		this.id = commentId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Comment [id=" + id + ", postId=" + postId +  ", parentId=" + parentId
				+ ", description=" + description + "]";
	}
	
	
}

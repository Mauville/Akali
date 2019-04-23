
public abstract class Resource {
 private String content, language, status, origin, author;
 
 
		public String getStatus() {
			return status;
		}
		
		public void setStatus(String status) {
			this.status = status;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public String getLanguage() {
			return language;
		}
		
		public void setLanguage(String language) {
			this.language = language;
		}
		
		public String getContent() {
			return content;
		}
		
		public void setContent(String content) {
			this.content = content;
		}
		
		public String getOrigin() {
			return origin;
		}
		
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		 
}

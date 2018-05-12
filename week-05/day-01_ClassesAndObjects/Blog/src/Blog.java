import java.util.ArrayList;
import java.util.List;


public class Blog {
    public List<BlogPost> blogPostList;

    public Blog() {
        blogPostList = new ArrayList();
    }

    public List<BlogPost> getBlogPostList() {
        return blogPostList;
    }

    public List<BlogPost> addPost() {
        blogPostList.add(new BlogPost());
        return blogPostList;
    }

    public List<BlogPost> addPost(BlogPost blogPost) {
        blogPostList.add(blogPost);
        return blogPostList;
    }

    public void deletePost(int index) {
        blogPostList.remove(index);
    }

    public void updatePost(int index, BlogPost blogPost) {
        blogPostList.set(index, blogPost);
    }
}

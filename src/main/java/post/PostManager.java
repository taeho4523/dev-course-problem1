package post;

import java.util.ArrayList;
import java.util.List;

public class PostManager {

    private final List<Post> posts = new ArrayList<>();
    private int nextId=1;

    public void addPost(String title, String content) {
        posts.add(new Post(nextId++, title, content));
    }

    public Post getPost(int id){
        return posts.stream()
                .filter(post->post.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public boolean deletePost(int id) {
        boolean removed = posts.removeIf(post->post.getId()==id);
        if(removed){
            resetIds();
        }
        return removed;
    }

    private void resetIds(){
        for(int i=0; i<posts.size(); i++){
            posts.get(i).setId(i+1);
        }
        nextId=posts.size()+1;
    }

    public boolean updatePost(int id, String title, String content) {
        for(Post post : posts){
            if(post.getId()==id){
                post.setTitle(title);
                post.setContent(content);
                return true;
            }
        }
        return false;
    }

    public List<Post> getAllPosts(){
        return posts;
    }

}

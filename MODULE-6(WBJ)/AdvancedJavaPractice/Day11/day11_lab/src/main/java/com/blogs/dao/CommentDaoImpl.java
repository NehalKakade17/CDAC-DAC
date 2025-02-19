package com.blogs.dao;

import com.blogs.pojos.Comment;
import com.blogs.pojos.BlogPost;
import com.blogs.pojos.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import static com.blogs.utils.HibernateUtils.getFactory;

public class CommentDaoImpl implements CommentDao {

    // Method to post a new comment
    @Override
    public String postNewComment(Comment newComment, Long commenterId, Long postId) {
        String result = "Failed to post comment";
        
        Session session = getFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        try {
            // Fetching the commenter (user) by its ID
            User commenter = session.get(User.class, commenterId);
            if (commenter == null) {
                result = "User not found!";
                return result;
            }

            // Fetching the blog post by its ID
            BlogPost post = session.get(BlogPost.class, postId);
            if (post == null) {
                result = "Blog post not found!";
                return result;
            }

            // Setting the commenter and post to the new comment
            newComment.setCommenter(commenter);
            newComment.setPost(post);

            // Saving the new comment
            session.save(newComment);

            tx.commit();
            result = "Comment posted successfully!";
        } catch (RuntimeException e) {
            if (tx != null) {
                tx.rollback();  // Rollback if there's an error
            }
            result = "Error posting comment: " + e.getMessage();
        }

        return result;
    }

    // Method to get all comments by a given blog post title
    
    @Override
    public List<Comment> getCommentsByPost(String postTitle) {
        List<Comment> comments = null;

        // Correct JPQL to query comments associated with the blog post title
        String jpql = "SELECT c FROM Comment c WHERE c.post.title = :title";  // Fetching comments by post title

        Session session = getFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        try {
            // Fetching the comments associated with the blog post title
            comments = session.createQuery(jpql, Comment.class)
                              .setParameter("title", postTitle)
                              .getResultList();  // Using getResultList() to get all the comments

            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();  // For debugging purposes
        }

        return comments;
    }
}








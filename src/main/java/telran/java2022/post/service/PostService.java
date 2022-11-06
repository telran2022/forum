package telran.java2022.post.service;

import java.util.List;

import telran.java2022.post.dto.DatePeriodDto;
import telran.java2022.post.dto.NewCommentDto;
import telran.java2022.post.dto.NewPostDto;
import telran.java2022.post.dto.PostDto;

public interface PostService {
	PostDto addNewPost(NewPostDto newPost, String author);

	PostDto getPost(String id);

	PostDto removePost(String id);

	PostDto updatePost(NewPostDto postUpdateDto, String id);

	void addLike(String id);

	PostDto addComment(String id, String author, NewCommentDto newCommentDto);

	Iterable<PostDto> findPostsByAuthor(String author);

	Iterable<PostDto> findPostsByTags(List<String> tags);

	Iterable<PostDto> findPostsByDates(DatePeriodDto datePeriodDto);
}

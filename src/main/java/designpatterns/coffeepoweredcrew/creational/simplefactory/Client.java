package designpatterns.coffeepoweredcrew.creational.simplefactory;

public class Client {

	public static void main(String[] args) {
		Post blog = PostFactory.createPost("blog");
		System.out.println(blog);
		Post news = PostFactory.createPost("news");
		System.out.println(news);
	}

}

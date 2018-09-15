package test_embedded_data

class Post {

    static class Content {
        String title
        String body
    }

    String url
    Content content

    static embedded = ['content']

    static constraints = {
    }
}

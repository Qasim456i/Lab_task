public class Main {
    public static void main(String[] args) {
        
        Artist artist1 = new Artist("Pablo Picasso");

        
        Artwork artwork1 = new Artwork("Guernica", 1937, artist1);

        
        Artwork artwork2 = new Artwork("The Persistence of Memory", 1931);

       
        artwork1.display();
        artwork2.display();

        
        artwork2 = new Artwork("The Starry Night", 1889); 
        artwork2.display();

      
        Artwork shallowCopy = artwork1.shallowCopy();
        Artwork deepCopy = artwork1.deepCopy();

      
        artist1 = new Artist("New Name");

        
        System.out.println("After changing the original artist's name:");
        artwork1.display(); 
        shallowCopy.display(); 
        deepCopy.display(); 
    }
}
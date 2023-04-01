import java.util.ArrayList;

public class Library {
   public static void main(String[] args) {
      // Assignment
      ArrayList<String> books = new ArrayList<String>();
      books.add("Senja,Hujan & Cerita");
      books.add(" Rindu Karya Tereliye");
      books.add("1984");
      books.add("Laskar Pelangi");

      // Pemilihan
      if (books.contains("Senja,Hujan & Cerita")) {
         System.out.println("Senja,Hujan & Cerita ditemukan");
      } else {
         System.out.println("Senja,Hujan & Cerita tidak ditemukan");
      }

      // Pengulangan
      for (String book : books) {
         System.out.println("Book: " + book);
      }
   }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Demerger {

    public static List<Person> readInputFile(String fileName) {
        List<Person> persons = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty())
                    continue;

                String[] parts = line.split(",");
                if (parts.length == 3){
                    String name = parts[0].trim();
                    String gender = parts[1].trim();
                    String birthday = parts[2].trim();
                    persons.add(new Person(name, gender, birthday));
                }
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        return persons;
    }

    public static void main(String[] args) {
        List<Person> list = readInputFile("bai11-DSA-Stack-Queue/DemergingByQueue/src/input.txt");

        Queue<Person> nu = new LinkedList<>();
        Queue<Person> nam = new LinkedList<>();

        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("Nu")){
                nu.add(person);
            }else{
                nam.add(person);
            }
        }

        try(PrintWriter pw = new PrintWriter(new File("bai11-DSA-Stack-Queue/DemergingByQueue/src/output.txt"))) {
            while (!nu.isEmpty()){
                pw.println(nu.remove());
            }
            while (!nam.isEmpty()){
                pw.println(nam.remove());
            }
            System.out.println("Done");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

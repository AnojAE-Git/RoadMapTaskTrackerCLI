import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TaskTrackerCLI {

    public static void main(String[] args){

        String jsonFilePath = "src/resources/TaskTracker.json";
        getorCreateJsonFile(jsonFilePath);

    }

    public static void getorCreateJsonFile(String jsonFilePath){

        Path jsonPath = Paths.get(jsonFilePath);
        if(Files.exists(jsonPath))
            System.out.println("JSON file already exists");
        else{
            try{
                Files.createFile(jsonPath);
            }catch (Exception exception){
                System.out.println("Exception raised with message : " + exception.getMessage() + " and StackTrace : " + exception.getStackTrace());
            }
        }

    }

}
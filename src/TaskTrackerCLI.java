package src;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class TaskTrackerCLI {

    public static void main(String[] args){

        String jsonFilePath = "../res/TaskTracker.json";
        getOrCreateJsonFile(jsonFilePath);

    }

    public static void getOrCreateJsonFile(String jsonFilePath){

        Path jsonPath = Paths.get(jsonFilePath);
        if(Files.exists(jsonPath))
            System.out.println("JSON file already exists");
        else{
            try{
                Files.createFile(jsonPath);
            }catch (Exception exception){
                System.out.println("Exception raised with message : " + exception.getMessage() + " and StackTrace : " + Arrays.toString(exception.getStackTrace()));
            }
        }

    }

}
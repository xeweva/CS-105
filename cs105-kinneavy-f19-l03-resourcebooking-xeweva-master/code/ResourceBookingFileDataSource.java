package edu.sbcc.cs105.scheduling;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/**
 * FileBookingDataSource
 */
public class ResourceBookingFileDataSource  {

    private String fileName;

    public ResourceBookingFileDataSource(String fileName) {
        this.fileName = fileName;
    }

    public HashMap<Integer, Resource> load() throws Exception {

        HashMap<Integer, Resource> resourceMap = new HashMap<>();

                
        Path path = Paths.get(fileName);
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");

            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {// while there is content on the current line
               
                String[] data = currentLine.split(",");
                if (data.length != 8){
                    throw new Exception("Invalid record format");
                }

                int resourceId = Integer.parseInt(data[0]);  
                String resourceName = data[1];
                int bookingId = Integer.parseInt(data[2]);
                char dayOfWeek = data[3].charAt(0);
                String startTime = data[4];
                int duration = Integer.parseInt(data[5]);
                String bookedBy = data[6];
                Date bookDate = dateFormat.parse(data[7]);
                
                Timeslot timeslot = new Timeslot(dayOfWeek, startTime, duration);

                Resource resource = null;
                Integer resourceKey = Integer.valueOf(resourceId);
                if (resourceMap.containsKey(resourceId)){
                   
                    resource = resourceMap.get(resourceKey);
                } else {
                    resource = new Resource(resourceId, resourceName);
                    resourceMap.put(resourceKey, resource);
                }
                
                resource.loadBooking(timeslot, bookingId, bookedBy, bookDate);
            
            }

            return resourceMap;
        
    }
}

}
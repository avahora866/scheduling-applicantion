package com.schedule.TimeSaver.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.schedule.TimeSaver.entity.*;
import com.schedule.TimeSaver.repository.*;
import com.schedule.TimeSaver.request.*;
import com.schedule.TimeSaver.response.ListResponse;
import com.schedule.TimeSaver.response.UserResponse;
import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@Component
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @Autowired
    private UsersRepository userRepo;
    @Autowired
    private TasksRepository tasksRepo;
    @Autowired
    private TaskLineRepository taskLineRepo;
    @Autowired
    private RemindersRepository remindersRepo;
    @Autowired
    private ReminderLineRepository reminderLineRepo;
    @Autowired
    private ListRepository listRepo;
    @Autowired
    private ListLineRepository listLineRepo;
    @Autowired
    private EventsRepository eventsRepo;
    @Autowired
    private EventLineRepository eventLineRepo;


    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }

    @PostMapping(path = "/login" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<UserResponse> verifyLogin(@RequestBody LoginDetails loginDetails ) {
        if(loginDetails.getUserName().isEmpty()){
            if(userRepo.findByEmailAndPassword(loginDetails.getEmail(), loginDetails.getPassword()).isPresent()) {
                int id = userRepo.findByEmailAndPassword(loginDetails.getEmail(), loginDetails.getPassword()).get().getUserID();
                UsersEntity user = userRepo.findById(id).get();
                UserResponse response =  userMapper(user);
                return ResponseEntity.ok(response);
            }else{
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            }
        }else{
            if(userRepo.findByUsernameAndPassword(loginDetails.getUserName(), loginDetails.getPassword()).isPresent()) {
                int id = userRepo.findByUsernameAndPassword(loginDetails.getUserName(), loginDetails.getPassword()).get().getUserID();
                UsersEntity user = userRepo.findById(id).get();
                UserResponse response =  userMapper(user);
                return ResponseEntity.ok(response);
            }else{
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            }
        }
    }

    private UserResponse userMapper(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        UserResponse response = mapper.convertValue(object, UserResponse.class);
        return response;
    }

    @PostMapping(path = "/register" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<UserResponse> createUser(@RequestBody RegisterDetails registerDetails) {
        UsersEntity user = new UsersEntity(registerDetails.getFirstName(), registerDetails.getLastName(), registerDetails.getEmail(), registerDetails.getUsername(), registerDetails.getPassword());
        UsersEntity userAdded= userRepo.save(user);
        taskLineRepo.save(new TaskLineEntity(userAdded));
        reminderLineRepo.save(new ReminderLineEntity(userAdded));
        listLineRepo.save(new ListLineEntity(userAdded));
        eventLineRepo.save(new EventLineEntity(userAdded));
        UserResponse response = userMapper(user);
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/create-list" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> createList(@RequestBody ListDetails listDetails) {
        Optional<UsersEntity> user = userRepo.findById(listDetails.getUserId());
        Optional<ListLineEntity> listLine = listLineRepo.findByUser(user.get());

        ListEntity list = new ListEntity(listDetails.getName(), listLine.get());
        ListEntity listAdded = listRepo.save(list);
        return new ResponseEntity<>("listAdded", HttpStatus.OK);

    }

    private ListResponse listMapper(ListEntity object) {
        if (object.getTasks() == null){
            List<TasksEntity> tasks = new ArrayList<TasksEntity>();
            object.setTasks(tasks);
        }
        if (object.getEvents() == null){
            List<EventsEntity> events = new ArrayList<EventsEntity>();
            object.setEvents(events);
        }

        ListResponse response = new ListResponse(object.getListID(), object.getName(), object.getListLine(), object.getTasks(), object.getEvents());


//        ObjectMapper mapper = new ObjectMapper();
//        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        mapper.disable(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES);
//
//        ListResponse response = mapper.convertValue(object, ListResponse.class);
        return response;
    }


    @PostMapping(path = "/create-task" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> createTask(@RequestBody TaskDetails taskDetails) {
        Optional<UsersEntity> user = userRepo.findById(taskDetails.getUserId());
        Optional<TaskLineEntity> taskLine = taskLineRepo.findByUser(user.get());
        Optional<ListEntity> list = listRepo.findByName(taskDetails.getListName());


        TasksEntity task = new TasksEntity(taskLine.get(), list.get(), taskDetails.getName(), taskDetails.getDescription(), taskDetails.getColor(), taskDetails.getRepeating(), taskDetails.getDate());
        TasksEntity tasksEntity = tasksRepo.save(task);
        return new ResponseEntity<>("taskAdded", HttpStatus.OK);

    }

    @PostMapping(path = "/create-event" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> createEvent(@RequestBody EventDetails eventDetails) {
        Optional<UsersEntity> user = userRepo.findById(eventDetails.getUserId());
        Optional<EventLineEntity> eventLine = eventLineRepo.findByUser(user.get());
        Optional<ListEntity> list = listRepo.findByName(eventDetails.getListName());


        EventsEntity event = new EventsEntity(eventLine.get(), list.get(), eventDetails.getName(), eventDetails.getDescription(), eventDetails.getColor(), eventDetails.getRepeating(), eventDetails.getDate());
        EventsEntity eventsEntity = eventsRepo.save(event);
        return new ResponseEntity<>("eventAdded", HttpStatus.OK);

    }





    

}

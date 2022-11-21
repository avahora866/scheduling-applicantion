package com.schedule.TimeSaver.controller;

import com.schedule.TimeSaver.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
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

}

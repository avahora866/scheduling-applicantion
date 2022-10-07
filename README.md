# scheduling-applicantion

Scheduling Application created in Angular and Springboot with a H2 DB.
Requirments:
Be able to create an account
Be able to login into your account
Be able to create a task 
Be able to create an event
Be able to create a reminder
Be able to view the calander and its events, tasks, reminders

When creating a task should be able to:
Specify date and time
Colour code it 
Put it in a list
Add a description
Set it as a repeating task

When creating a event should be able to:
Specify date and time
Colour code it 
Put it in a list
Add a description
Set it as a repeating event

When creating a reminder should be able to:
Specify date and time
Colour code it 
Will not be seprated into lists
Add a description
Set it as a repeating reminder

When viewing the calander:
Should be able to filter by events, tasks and reminders as well as lists

Other requirments:
Send a email at beginning of week regarding all future events, tasks and reminders
Should be able to create your own list
Dark Mode
Manage your account
Forgot password
Edit a task or reminder

In Depth:
Logging in / Registering:
User can log in with either username or email
Password mus be 8 chars and have oen special char, one number and one upper case char

Task, Event, Reminder Creation:
Every item will be assigned to a list. Default list everyone has is called "My List"

Future applications:
1. Should let the program schedule your time:
  First block out all the time you are sure you wont be able to do anything (work, events etc) wil be labelled as busy and will need to be seperated into events and other (work)
  Then input what tasks you want to complete each day, then each week, then each month, then any other tasks you want to do a custom repeating amount, then any tasks you only need to complete once or twice
  Each task will have to be assigned a time in order to complete 1 for one hour 2 for 2 and so on
  Each task will need to be assigned to a list
  The computer will then schedule the task and seperate into smaller tasks where necessary. It will use the podmoro method to schedule the longer tasks 
2. Mobile versions

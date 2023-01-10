INSERT INTO USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, USERNAME) VALUES
    ('jdoe@hotmail.com', 'Jhon', 'Doe', 'password', 'JDoe'),
    ('jsmith@hotmail.com', 'Jane', 'Smith', 'password', 'JSmith'),
    ('dfrancis@hotmail.com', 'Davide', 'Francis', 'password', 'DFrancis'),
    ('alyon@hotmail.com', 'Andrew', 'Lyon', 'password', 'ALyon');
;


INSERT INTO TASKLINE (USER_ID) VALUES
    (1),
    (2),
    (3),
    (4);

INSERT INTO REMINDERLINE (USER_ID) VALUES
    (1),
    (2),
    (3),
    (4);

INSERT INTO EVENTLINE (USER_ID) VALUES
    (1),
    (2),
    (3),
    (4);

INSERT INTO LISTLINE (USER_ID) VALUES
    (1),
    (2),
    (3),
    (4);

INSERT INTO LIST (LISTNAME, LIST_LINE_ID) VALUES
    ('JDoes List 1', 1),
    ('JSmith List 1', 2),
    ('DFrancis List 1', 3),
    ('DFrancis List 2', 3);

INSERT INTO TASKS (COLOR, DATE, DESCRIPTION, NAME, REPEATING, LIST_ID, TASK_LINE_ID) VALUES
    ('Blue', '2022-09-13 13:42:05', 'TestDescription', 'JDoe first task', false, 1, 1),
    ('Green', '2022-06-20 18:30:15', 'TestDescription', 'JSmith first task', false, 2, 2),
    ('Green', '2022-03-05 11:33:19', 'TestDescription', 'JSmith second task in same list', false, 2, 2),
    ('Red', '2022-03-17 15:20:10', 'TestDescription', 'DFrancis first task', false, 3, 3),
    ('Blue', '2022-06-09 12:10:18', 'TestDescription', 'DFrancis second task in second list', false, 4, 3);

INSERT INTO EVENTS (COLOR, DATE, DESCRIPTION, NAME, REPEATING, LIST_ID, EVENT_LINE_ID) VALUES
    ('Blue', '2022-09-13 13:42:05', 'TestDescription', 'JDoe first event', false, 1, 1),
    ('Green', '2022-06-20 18:30:15', 'TestDescription', 'JSmith first event', false, 2, 2),
    ('Green', '2022-03-05 11:33:19', 'TestDescription', 'JSmith second event in same list', false, 2, 2),
    ('Red', '2022-03-17 15:20:10', 'TestDescription', 'DFrancis first event', false, 3, 3),
    ('Blue', '2022-06-09 12:10:18', 'TestDescription', 'DFrancis second event in second list', false, 4, 3);

INSERT INTO REMINDERS (COLOR, DATE, DESCRIPTION, NAME, REPEATING, REMINDER_LINE_ID) VALUES
    ('Blue', '2022-09-13 13:42:05', 'TestDescription', 'JDoe first reminder', false, 1),
    ('Green', '2022-06-20 18:30:15', 'TestDescription', 'JSmith first reminder', false, 2),
    ('Green', '2022-03-05 11:33:19', 'TestDescription', 'JSmith second reminder', false, 2),
    ('Red', '2022-03-17 15:20:10', 'TestDescription', 'DFrancis first reminder', false, 3),
    ('Blue', '2022-06-09 12:10:18', 'TestDescription', 'DFrancis second reminder', false, 3);





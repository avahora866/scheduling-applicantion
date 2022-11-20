import { Component, OnInit } from '@angular/core';

const EVENTS: any = [
  {date: "1", name: "event"}
]
const REMINDERS: any = [
  {date: "1", name: "reminder"}
]
const TASKS: any = [
  {date: "1", name: "task"}
]

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  ev = EVENTS;
  rm = REMINDERS;
  tk = TASKS;


  constructor() { }

  ngOnInit(): void {
  }

}

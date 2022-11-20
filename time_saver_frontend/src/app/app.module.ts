import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Router, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { CalanderComponent } from './components/home/calander/calander.component';
import { DateComponent } from './components/home/calander/date/date.component';
import { ItemComponent } from './components/home/calander/date/item/item.component';
import { SidebarComponent } from './components/home/sidebar/sidebar.component';
import { AccountComponent } from './components/account/account.component';
import { RegisterComponent } from './components/register/register.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    HomeComponent,
    CalanderComponent,
    DateComponent,
    ItemComponent,
    SidebarComponent,
    AccountComponent,
    RegisterComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'login', component: LoginComponent},
      {path: 'account', component:AccountComponent},
      {path: 'register', component: RegisterComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

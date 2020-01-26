import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MaterialModule } from './material/material.module';


import { HomepageComponent } from './homepage/homepage.component';
import { CreateProfilComponent } from './create-profil/create-profil.component';

import { ProfilListComponent } from './profil-list/profil-list.component';

import { HeaderComponent } from './header/header.component';

import { GardenListComponent } from './garden-list/garden-list.component';

import { GardeningListComponent } from './gardening-list/gardening-list.component';
import { CreateProfilGardeningComponent } from './create-profil-gardening/create-profil-gardening.component';


import { GardenComponent } from './garden/garden.component';
import { MessageComponent } from './message/message.component';
import { BannerComponent } from './banner/banner.component';
import { CoupDeMainComponent } from './coup-de-main/coup-de-main.component';
import { FooterComponent } from './footer/footer.component';
import { AddressComponent } from './address/address.component';



import { ProfileComponent } from './profile/profile.component';

import { LoginComponent } from './forms/login/login.component';
import { RegisterComponent } from './forms/register/register.component';
import { WelcomeComponent } from './welcome/welcome/welcome.component';

import { JwPaginationComponent } from 'jw-angular-pagination';
import { ProfilComponent } from './profil/profil.component';
import {FileUploadModule} from 'ng2-file-upload';
import { UploadFileComponent } from './upload-file/upload-file.component';
import { UpdateGardenComponent } from './update-garden/update-garden.component';
@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    CreateProfilComponent,
    
    ProfilListComponent,
    HeaderComponent,
    GardenListComponent,
    
    GardeningListComponent,
    CreateProfilGardeningComponent,
   
    
    GardenComponent,
    MessageComponent,
    BannerComponent,
    CoupDeMainComponent,
    FooterComponent,
    AddressComponent,
    ProfileComponent,
    
    LoginComponent,
    RegisterComponent,
    WelcomeComponent,
    JwPaginationComponent,
    ProfilComponent,
    UploadFileComponent,
    UpdateGardenComponent
    
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MaterialModule,
    ReactiveFormsModule,
    FileUploadModule,
    
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

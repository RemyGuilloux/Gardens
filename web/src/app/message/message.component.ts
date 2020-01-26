import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from  '@angular/forms';


@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})
export class MessageComponent {
  contactForm: FormGroup;
  submitted = false;
name: string;
email: string;
  
  constructor(private formBuilder: FormBuilder) {
    this.createContactForm();
   }

  
  onSubmit() {
    this.submitted = true;
    console.log('Your form data : ', this.contactForm.value );
    
  }
  createContactForm(){
    this.contactForm = this.formBuilder.group({
      name: [''],  
      email: [''],
      message: ['']
    });
  }

}

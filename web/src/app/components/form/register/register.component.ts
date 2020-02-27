import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { AuthService } from 'src/app/services/oauth/auth.service';
import { PasswordValidator } from 'src/app/ressources/password.validator';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { FormFactory } from 'src/app/ressources/form.factory';
import { RegisterInfo } from 'src/app/models/register.model';
import { AuthLogin } from 'src/app/models/login.model';
import { ParentErrorStateMatcher } from 'src/app/ressources/error.options';
import { MatSnackBar } from '@angular/material';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  encapsulation: ViewEncapsulation.None
})
export class RegisterComponent implements OnInit {

  constructor(protected router: Router, private authService: AuthService, private fb: FormBuilder, private forms: FormFactory, private snackBar: MatSnackBar) {  }

  loading = false;
  
  protected registerForm: FormGroup;
  protected passwordForm: FormGroup;
  readonly errorMessages = this.forms.errorMessages;
  protected parentErrorStateMatcher = new ParentErrorStateMatcher();

  get username() { return this.registerForm.get('username'); }
  get email() { return this.registerForm.get('email'); }
  get password() { return this.passwordForm.get('password'); }
  get confirm() { return this.passwordForm.get('confirm'); }
  get agree() { return this.registerForm.get('agree'); }
  data: any;
  ngOnInit(): void { 
    this.passwordForm = this.forms.passwordForm;
    this.registerForm =  this.forms.registerForm;
  }

  register(): any {
      this.loading = true;
      this.authService.signUp(this.registerCredentials())
        .subscribe(registerForm => 
            registerForm, )
            this.router.navigate(['/welcome']);
        
        this.snackBar.open('Votre compte à été ajouté avec succès   '+'   Pour vous connecter à l application, Veuillez vous rendre sur l onglet login', '', { duration: 5000 } );
    }

  private registerCredentials = () => new RegisterInfo(this.username.value, this.email.value, this.password.value);

  private loginCredentials = () => new AuthLogin(this.username.value, this.password.value);

}


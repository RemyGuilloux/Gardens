import { Component, OnInit } from '@angular/core';
import { Profil } from "../Profil";
import { ProfilService } from '../profil.service';
import { Router } from '@angular/router';
import { Garden } from '../Garden';
import { GardenService } from '../garden.service';
import { Address } from '../Address';
import { AddressService } from '../address.service';
import { FormGroup, FormControl } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
@Component({
  selector: 'app-create-profil',
  templateUrl: './create-profil.component.html',
  styleUrls: ['./create-profil.component.css']
})
export class CreateProfilComponent implements OnInit {
profil: Profil = new Profil();
garden: Garden = new Garden();
address: Address = new Address();
submitted = false;


  constructor( private profilService: ProfilService, private router: Router, private gardenService: GardenService, private addressService : AddressService) { }

  ngOnInit() {
  }
 

  save() {
    this.profilService.createProfil(this.profil)
    .subscribe(data=>
      {
      console.log("voila tron profil = ", data);
    }, error => console.log(error));

    this.gardenService.createGarden(this.garden)
    .subscribe(data=>
      {
      console.log("voila tron profil = ", data);
    }, error => console.log(error));

    this.addressService.createAddress(this.address)
      .subscribe(data => 
      {
        console.log("voila tron profil = ", data);
      }, error => console.log(error));
    
  
  }
  
  get() {
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
   
  }
  gotoList(){
    this.router.navigate(['/profils']);
  }
 
}

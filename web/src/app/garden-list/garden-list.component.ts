import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { GardenService } from "../garden.service";
import { Garden } from "../Garden";
import { Router } from '@angular/router';
import { ProfilService } from "../profil.service";
import { Profil } from "../Profil";
import { AddressService } from "../address.service";
import { Address } from "../Address";
@Component({
  selector: 'app-garden-list',
  templateUrl: './garden-list.component.html',
  styleUrls: ['./garden-list.component.css']
})
export class GardenListComponent implements OnInit {
gardens: Observable<Garden[]>;
profil: Profil = new Profil();
address: Address = new Address();
submitted = false;
id: number;
  constructor(private gardenService: GardenService, private router: Router, private profilService: ProfilService, private addressService: AddressService) {
    this.profil = new Profil();
    this.address = new Address();
   }

  ngOnInit() {
    this.reloadData();
  }

  reloadData(){
    this.gardens = this.gardenService.getGardensList();
  }
  get(profilId) {
    this.profilService.getProfil(profilId)
      .subscribe(data => {
    this.profilService.profil = data;
    console.log(data);
    this.goto();
      });
    
    
  }
  goto() {
    this.router.navigate(['/profil']);
  }
  
  
  gotoList(){
    this.router.navigate(['/profils']);
  }
  getP() {
    this.gotoList1();
  }

  gotoList1() {
    this.router.navigate(['/profils']);
  }
  getH() {
    this.gotohome();
  }

  gotohome() {
    this.router.navigate(['/homepage']);
  }
  getAd(addressId) {
    console.log("id de l'adresse est =", this.id)
    this.addressService.getAddress(addressId)
      .subscribe(data => {
        this.addressService.address = data;
        this.gotoAddress();
      });
    
  }
  gotoAddress() {
    this.router.navigate(['/address']);
  }
}

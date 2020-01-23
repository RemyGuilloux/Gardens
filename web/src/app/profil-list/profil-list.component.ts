import { Component, OnInit} from '@angular/core';
import { Observable } from "rxjs";
import { ProfilService } from "../profil.service";
import { Profil } from "../Profil";
import { GardenService } from "../garden.service";
import { Garden } from "../Garden";
import { Router } from '@angular/router';


@Component({
  selector: 'app-profil-list',
  templateUrl: './profil-list.component.html',
  styleUrls: ['./profil-list.component.css']
})
export class ProfilListComponent implements OnInit {
  profils: Observable<Profil[]>;
  profil: Profil = new Profil();
  garden: Garden = new Garden();
  
  submitted = false;
 
  id:number;
  
  constructor(private profilService: ProfilService, private router: Router, private gardenService: GardenService) {
    this.garden = new Garden();
   }
   

  ngOnInit() {
    this.reloadData();
  }
  
  reloadData() {
    this.profils = this.profilService.getProfilsList();
    
  }


  get(gardenId) {
    this.gardenService.getGarden(gardenId)
    .subscribe(data => {
      this.gardenService.garden = data;
      console.log(data)
      this.goto();
    });
  }
  goto() {
    this.router.navigate(['/garden']);
  }

  getH() {
    this.gotohome();
  }

  gotohome() {
    this.router.navigate(['/homepage']);
  }
}



import { Component, OnInit } from '@angular/core';
import { Gardening } from "../Gardening";
import { GardeningService } from '../gardening.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-create-profil',
  templateUrl: './create-profil-gardening.component.html',
  styleUrls: ['./create-profil-gardening.component.css']
})
export class CreateProfilGardeningComponent implements OnInit {
gardening: Gardening = new Gardening();
submitted = false;

  constructor(private gardeningService: GardeningService, private router: Router) { }

  ngOnInit() {
  }
  newProfil(): void {
    this.submitted = false;
    this.gardening = new Gardening();
  }

  save() {
    this.gardeningService.createGardening(this.gardening)
      .subscribe(data => console.log(data), error => console.log(error));
    this.gardening = new Gardening();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }
  gotoList(){
    this.router.navigate(['/gardening']);
  }
}


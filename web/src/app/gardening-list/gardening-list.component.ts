import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { GardeningService } from "../gardening.service";
import { Gardening } from "../Gardening";

import { Router } from '@angular/router';

@Component({
  selector: 'app-gardening-list',
  templateUrl: './gardening-list.component.html',
  styleUrls: ['./gardening-list.component.css']
})
export class GardeningListComponent implements OnInit {
 gardenings: Observable<Gardening[]>;
  constructor(private gardeningService: GardeningService, private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
    this.gardenings = this.gardeningService.getGardeningsList();
  }
  getH() {
    this.gotohome();
  }

  gotohome() {
    this.router.navigate(['/homepage']);
  }
  
}

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { GardenService } from '../garden.service';
import { Garden } from '../Garden';

@Component({
  selector: 'app-update-garden',
  templateUrl: './update-garden.component.html',
  styleUrls: ['./update-garden.component.css']
})
export class UpdateGardenComponent implements OnInit {

  id: number;
  garden: Garden;
  submitted = false;
  constructor(private route: ActivatedRoute,private router: Router,private gardenService: GardenService) { }

  ngOnInit() {

    this.garden = new Garden();
    this.id = this.route.snapshot.params['id'];

    this.gardenService.getGarden(1)
    .subscribe(data => {
      console.log(data);
      this.garden = data;
    }, error => console.log(error));

  }

  updateGarden() {
    this.gardenService.updateGarden(this.id, this.garden)
    .subscribe(data =>
      console.log(data), error => console.log(error));
    this.garden = new Garden();
    this.gotoList()
    }

    onSubmit() {
      this.updateGarden();
    }

    gotoList() {
      this.router.navigate(['/gardens']);
    }
  }



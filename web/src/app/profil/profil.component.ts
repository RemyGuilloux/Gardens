import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { ProfilService } from "../profil.service";
import { Profil } from "../Profil";
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profil',
  templateUrl: './profil.component.html',
  styleUrls: ['./profil.component.css']
})
export class ProfilComponent implements OnInit {
  profils: Observable<Profil[]>
profil: Profil = new Profil();
id: number;
data: string;
  constructor(private router: Router, private profilService: ProfilService) {
    this.profil = new Profil();
   }

  ngOnInit() {
    this.profil = this.profilService.profil;
  }
  get() {
    this.gotoList();
  }

  gotoList() {
    this.router.navigate(['/gardens']);
  }

}

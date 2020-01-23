import { Component, OnInit } from '@angular/core';
import { AddressService } from "../address.service";
import { Address } from "../Address";
import { Router } from '@angular/router';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.css']
})
export class AddressComponent implements OnInit {
  address: Address = new Address();

 
  constructor(private router: Router, private addressService: AddressService) { 
    this.address = this.addressService.address;
  }

  ngOnInit() {
    this.address = this.addressService.address;
  }
  get() {
    this.gotoList();
  }

  gotoList() {
    this.router.navigate(['/gardens']);
  }

}

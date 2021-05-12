import { Component, OnInit } from '@angular/core';
import {Rims} from "./Rims";
import {CarRimsService} from "./car-rims.service";

@Component({
  selector: 'app-car-rims',
  templateUrl: './car-rims.component.html',
  styleUrls: ['./car-rims.component.scss']
})
export class CarRimsComponent implements OnInit {

  carRims: Rims[] = [];
  selectedRimsId = 1;

  constructor(private carRimsService: CarRimsService) { }

  ngOnInit(): void {
    this.carRimsService.getAllRims().subscribe(rims => {
      this.carRims = rims;
    });
  }

}

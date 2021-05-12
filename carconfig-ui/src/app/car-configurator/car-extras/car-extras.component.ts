import { Component, OnInit } from '@angular/core';
import {ExtraEquipment} from "./ExtraEquipment";
import {FormControl} from "@angular/forms";
import {CarExtrasService} from "./car-extras.service";

@Component({
  selector: 'app-car-extras',
  templateUrl: './car-extras.component.html',
  styleUrls: ['./car-extras.component.scss']
})
export class CarExtrasComponent implements OnInit {

  carExtraEquipments: ExtraEquipment[] = [];
  extras = new FormControl();

  constructor(private carExtrasService: CarExtrasService) { }

  ngOnInit(): void {
    this.carExtrasService.getAllExtras().subscribe(extras => {
      this.carExtraEquipments = extras;
    });
  }

}

import { Component, OnInit } from '@angular/core';
import {CarModelService} from "./car-model.service";
import {Car} from "./Car";

@Component({
  selector: 'app-car-model',
  templateUrl: './car-model.component.html',
  styleUrls: ['./car-model.component.scss']
})
export class CarModelComponent implements OnInit {

  carModels: Car[] = [];
  selectedCarId = 1;

  constructor(private carModelService: CarModelService) { }

  ngOnInit(): void {
    this.carModelService.getAllCarModels().subscribe(carModels => {
      this.carModels = carModels;
    });
  }

}

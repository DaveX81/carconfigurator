import { Component, OnInit } from '@angular/core';
import {Engine} from "./Engine";
import {CarEngineService} from "./car-engine.service";

@Component({
  selector: 'app-car-engine',
  templateUrl: './car-engine.component.html',
  styleUrls: ['./car-engine.component.scss']
})
export class CarEngineComponent implements OnInit {

  carEngines: Engine[] = [];
  selectedEngineId = 1;

  constructor(private carEngineService: CarEngineService) { }

  ngOnInit(): void {
    this.carEngineService.getAllEngines().subscribe(engines => {
      this.carEngines = engines;
    });
  }

}

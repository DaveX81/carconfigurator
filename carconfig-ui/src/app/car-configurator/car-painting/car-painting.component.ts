import { Component, OnInit } from '@angular/core';
import {Painting} from "./Painting";
import {CarPaintingService} from "./car-painting.service";

@Component({
  selector: 'app-car-painting',
  templateUrl: './car-painting.component.html',
  styleUrls: ['./car-painting.component.scss']
})
export class CarPaintingComponent implements OnInit {

  carPaintings: Painting[] = [];
  selectedPaintingsId = 1;

  constructor(private carPaintingService: CarPaintingService) { }

  ngOnInit(): void {
    this.carPaintingService.getAllPaintings().subscribe(paintings => {
      this.carPaintings = paintings;
    });
  }

}

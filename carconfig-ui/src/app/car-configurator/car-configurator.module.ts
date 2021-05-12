import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ConfigurationComponent } from './configuration/configuration.component';
import { CarModelComponent } from './car-model/car-model.component';
import { CarEngineComponent } from './car-engine/car-engine.component';
import { CarExtrasComponent } from './car-extras/car-extras.component';
import { CarPaintingComponent } from './car-painting/car-painting.component';
import { CarRimsComponent } from './car-rims/car-rims.component';
import {MatCardModule} from "@angular/material/card";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatSelectModule} from "@angular/material/select";
import {ReactiveFormsModule} from "@angular/forms";
import {MatGridListModule} from "@angular/material/grid-list";



@NgModule({
  declarations: [
    ConfigurationComponent,
    CarModelComponent,
    CarEngineComponent,
    CarExtrasComponent,
    CarPaintingComponent,
    CarRimsComponent
  ],
  imports: [
    CommonModule,
    MatCardModule,
    MatFormFieldModule,
    MatSelectModule,
    MatGridListModule,
    ReactiveFormsModule
  ],
  exports: [
    ConfigurationComponent
  ]
})
export class CarConfiguratorModule { }

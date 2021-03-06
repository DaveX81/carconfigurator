import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ConfigurationComponent} from "./car-configurator/configuration/configuration.component";

const routes: Routes = [
  {
    path: '',
    component: ConfigurationComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

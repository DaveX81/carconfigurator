import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Car} from "./Car";
import {Configuration} from "../../shared/configuration";

@Injectable({
  providedIn: 'root'
})
export class CarModelService {

  constructor(private httpClient: HttpClient) { }

  public getAllCarModels(): Observable<Car[]> {
    return this.httpClient.get<Car[]>(Configuration.REST_URL.concat('/configuration/car'));
  }

}

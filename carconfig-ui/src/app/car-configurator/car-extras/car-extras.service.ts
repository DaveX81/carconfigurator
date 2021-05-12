import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ExtraEquipment} from "./ExtraEquipment";
import {Configuration} from "../../shared/configuration";

@Injectable({
  providedIn: 'root'
})
export class CarExtrasService {

  constructor(private httpClient: HttpClient) { }

  public getAllExtras(): Observable<ExtraEquipment[]> {
    return this.httpClient.get<ExtraEquipment[]>(Configuration.REST_URL.concat('/configuration/extraEquipment'));
  }
}

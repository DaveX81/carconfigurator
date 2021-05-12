import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Rims} from "./Rims";
import {Configuration} from "../../shared/configuration";

@Injectable({
  providedIn: 'root'
})
export class CarRimsService {

  constructor(private httpClient: HttpClient) { }

  public getAllRims(): Observable<Rims[]> {
    return this.httpClient.get<Rims[]>(Configuration.REST_URL.concat('/configuration/rims'));
  }

}

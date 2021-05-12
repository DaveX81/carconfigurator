import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Engine} from "./Engine";
import {Configuration} from "../../shared/configuration";

@Injectable({
  providedIn: 'root'
})
export class CarEngineService {

  constructor(private httpClient: HttpClient) { }

  public getAllEngines(): Observable<Engine[]> {
    return this.httpClient.get<Engine[]>(Configuration.REST_URL.concat('/configuration/engine'));
  }
}

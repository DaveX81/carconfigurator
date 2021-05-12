import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Painting} from "./Painting";
import {Configuration} from "../../shared/configuration";

@Injectable({
  providedIn: 'root'
})
export class CarPaintingService {

  constructor(private httpClient: HttpClient) { }

  public getAllPaintings(): Observable<Painting[]> {
    return this.httpClient.get<Painting[]>(Configuration.REST_URL.concat('/configuration/painting'));
  }

}

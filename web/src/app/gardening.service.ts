import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GardeningService {
id: number;
  private baseUrl = 'http://localhost:8083/api/gardenings';

  constructor(private http: HttpClient) { }

  getGardening(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}`+ id);
  }

  createGardening(gardening: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, gardening);
  }

  updateGardening(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteGardening(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }

  getGardeningsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}

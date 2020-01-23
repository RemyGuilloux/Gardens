import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Profil } from './Profil';


@Injectable({
  providedIn: 'root'
})
export class ProfilService {
  
  public profil:Profil;

  private baseUrl = 'http://localhost:8083/api/profils';

  constructor(private http: HttpClient) { }

  getProfil(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createProfil(profil: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, profil);
  }

  updateProfil(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteProfil(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }

  getProfilsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}

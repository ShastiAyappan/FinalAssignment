import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DoctorserviceService {
  apiUrlGet = "http://localhost:8080"
  apiUrlAdd = "http://localhost:8080/add";
  apiUrlCheck = "http://localhost:8080/check";
  constructor(private doctorHttp: HttpClient) { }

  getDoctor(){
    const doctor = this.doctorHttp.get(this.apiUrlGet);
    console.log("fromapiservice:"+doctor);
    return doctor;
  }

  checkDoctorAvailablity(data : any){
    const doctor = this.doctorHttp.post(this.apiUrlCheck, data);
    console.log("fromapiservice:"+doctor);
    return doctor;
  }
  getDoctorDetails(data : Object){
    this.doctorHttp.post(this.apiUrlAdd, data);
  }
}

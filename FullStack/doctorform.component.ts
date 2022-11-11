import { Component, OnInit } from '@angular/core';
import { DoctorserviceService } from '../doctorservice.service';
@Component({
  selector: 'app-doctorform',
  templateUrl: './doctorform.component.html',
  styleUrls: ['./doctorform.component.css']
})
export class DoctorformComponent implements OnInit {

  doctor : Array<any> = [];
  constructor(private doctorSer:DoctorserviceService) { }

  ngOnInit(): void {
  }
  onLoad(){
    const self = this;
    this.doctorSer.getDoctor()
    .subscribe( (data: any) => this.doctor = data);
  }
}

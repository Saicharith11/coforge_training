import { Component } from '@angular/core';

@Component({
  selector: 'app-directives',
  standalone: false,
  templateUrl: './directives.html',
  styleUrl: './directives.css',
})
export class Directives {
  myDivStyle: string;
  myButtonStyle: { [key: string]: string };
  message: string;
  flag : boolean;
  vehicles : string[];
  selectedVehicle : string;
  constructor() {
    this.myDivStyle = "MyDiv";

    this.myButtonStyle = {
      backgroundColor: "blue",
      color: "white",
      padding: "10px",
      borderRadius: "5px"
    };

    this.message = "Angular String Directives Example";
    this.flag = true;
    this.vehicles = ["Car", "Bike", "Bus", "Truck"];
    this.selectedVehicle = "";
  }
  showHideDiv() {
    this.flag = !this.flag;
}
  setSelectedVehicle(vehicle: string) {
    this.selectedVehicle = vehicle;
  }


}
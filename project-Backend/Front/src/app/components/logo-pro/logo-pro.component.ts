import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logo-pro',
  templateUrl: './logo-pro.component.html',
  styleUrls: ['./logo-pro.component.css']
})
export class LogoProComponent implements  OnInit {

  constructor(private router: Router){}

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  login(){
    this.router.navigate(['/login'])
  }
  
}

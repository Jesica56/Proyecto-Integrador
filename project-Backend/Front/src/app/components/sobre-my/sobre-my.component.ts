import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-sobre-my',
  templateUrl: './sobre-my.component.html',
  styleUrls: ['./sobre-my.component.css']
})
export class SobreMyComponent implements OnInit {
    persona: persona=new persona("","","");

  constructor(public personaService: PersonaService){}

  ngOnInit(): void {
    this.personaService.getPersonas().subscribe(data =>{this.persona = data})
  }

}

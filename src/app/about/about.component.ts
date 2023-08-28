import { Component, OnInit } from '@angular/core';
import { Personnel } from '../Models/personnel';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.scss']
})
export class AboutComponent implements OnInit{
  public listpersonnel:Personnel[]=[];
  ngOnInit(): void {
    this.listpersonnel.push(new Personnel("ddd","12","235","456"));
  }
  showpersonnel()
  {
    console.log(this.listpersonnel)
  }
 


}

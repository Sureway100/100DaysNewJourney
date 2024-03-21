import { Component,OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrl: './post.component.css'
})
export class PostComponent implements OnInit{
  title:string = 'heee';

  @Input() fromParent : any;

  constructor(){}

  ngOnInit(): void {
      
  }
}

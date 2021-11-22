import { Component } from "@angular/core";
import { Product } from "./Product";
@Component({
    selector:'my-product',
    template:`
    <div>
        <ul *ngFor="let p of product"><li>{{p.name}} {{p.price}} 
        <img src="C:/Users/Administrato/Desktop/{{p.image}}"" 
        alt="no image to show"></li></ul>
    </div>sets
    `
})
export class ProductComponent{
    product=[new Product('Book',100,'book.png'),new Product('Pen',200,'pen.png')];

}
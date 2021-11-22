import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { MyComponent } from './MyComponent';
//import { ForExample } from './ForExample';
//import {Student} from './Student';
import {FormsModule} from "@angular/forms";
//import { ifExample } from './ifExample';
//import {CustomDirective} from './CustomDirectives';
import {Product} from './Product';
import {ProductComponent} from './ProductComponent';
@NgModule({
  declarations: [
    AppComponent,ProductComponent,Product
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { NgModule, OnInit } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProduitComponent } from './produit/produit.component';
import { PanierComponent } from './panier/panier.component';
import { ListeProduitComponent } from './liste-produit/liste-produit.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './commander/login.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { HttpClientModule } from '@angular/common/http';
import { PersonnelComponent } from './personnel/personnel.component';
import { ListPersonnelComponent } from './list-personnel/list-personnel.component';
import { PersonnaliserComponent } from './personnaliser/personnaliser.component';
import { DashboardComponent } from './dashboard/dashboard.component'
import { GoogleMapsModule } from '@angular/google-maps';
@NgModule({
  declarations: [
    AppComponent,
    ProduitComponent,
    PanierComponent,
    ListeProduitComponent,
    NavbarComponent,
    FooterComponent,
    LoginComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    PersonnelComponent,
    ListPersonnelComponent,
    PersonnaliserComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    FormsModule,
    GoogleMapsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule   {

}

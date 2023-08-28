import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PanierComponent } from './panier/panier.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './commander/login.component';
import { PersonnaliserComponent } from './personnaliser/personnaliser.component';

const routes: Routes = [
  
   { path:"home",component:HomeComponent},
    {path:"panier/:id",component:PanierComponent},
  
    {path:"login",component:LoginComponent},

   {path:"panier",component:PanierComponent},
   {path:"contact",component:ContactComponent},

     {path:"about",component:AboutComponent},
     {path:"personnaliser",component:PersonnaliserComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

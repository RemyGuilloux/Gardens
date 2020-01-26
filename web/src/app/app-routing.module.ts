import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateProfilComponent } from './create-profil/create-profil.component';
import { ProfilListComponent } from './profil-list/profil-list.component';
import { HomepageComponent } from './homepage/homepage.component';
import { GardenListComponent } from './garden-list/garden-list.component';
import { ProfilComponent } from './profil/profil.component';
import { GardeningListComponent} from './gardening-list/gardening-list.component';
import { CreateProfilGardeningComponent } from './create-profil-gardening/create-profil-gardening.component';
import { MessageComponent } from'./message/message.component';
import { GardenComponent } from './garden/garden.component';
import { WelcomeComponent } from './welcome/welcome/welcome.component';
import { AddressComponent } from './address/address.component';
import { AuthGuard } from './services/oauth/guards/auth.gard';
import { UserGuard } from './services/oauth/guards/user.gard';
import { UpdateGardenComponent } from './update-garden/update-garden.component';

const routes: Routes = [
  {path: '', redirectTo: '/welcome', pathMatch: 'full'},
  {path: 'gardenUpdate/:id' , component: UpdateGardenComponent},
  {path: 'gardens', component: GardenListComponent},
  {path: 'welcome', component: WelcomeComponent},
  {path: 'profils', component: ProfilListComponent},
  {path: 'gardening', component: GardeningListComponent},
  {path: 'add', component: CreateProfilComponent},
  {path: 'add gardening', component: CreateProfilGardeningComponent},
  {path: 'homepage', component: HomepageComponent},
  {path: 'garden', component: GardenComponent},
  {path: 'address', component: AddressComponent},
  {path: 'profil', component: ProfilComponent},
  {path: 'message', component: MessageComponent},
  {
    path: 'homepage',
    component: HomepageComponent,
    canActivate: [AuthGuard]
  },
  {
    path: 'homepage',
    component: HomepageComponent,
    canActivate: [UserGuard]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

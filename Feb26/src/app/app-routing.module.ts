import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './user/register/register.component';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { AddUserComponent } from './add-user/add-user.component';
import { LoginComponent } from './login/login.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { PipesComponent } from './pipes/pipes/pipes.component';
import { AdminComponent } from './admin/admin.component';
import { ImportComponent } from './import/import.component';
import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';
import { DeletecompanyComponent } from './deletecompany/deletecompany.component';
import { UseripoComponent } from './useripo/useripo.component';
import { CompanyrelatedataComponent } from './companyrelatedata/companyrelatedata.component';
import { StockexchangeComponent } from './stockexchange/stockexchange.component';
import { StockpriceComponent } from './stockprices/stockprices.component';
import { UserlandingComponent } from './userlanding/userlanding.component';
import { CompaniesComponent } from './companies/companies.component';
import { StockexchangesComponent } from './stockexchanges/stockexchanges.component';
import { UpdatestockexchangeComponent } from './updatestockexchange/updatestockexchange.component';
const routes: Routes = [
  {path:'register',component:RegisterComponent},
  {path:'users',component: UsersComponent},
  {path:'add-user',component: AddUserComponent },
  {path:'login',component: LoginComponent},
  {path:'update-user',component:UpdateUserComponent},
  {path:'admin',component:AdminComponent},
  {path:'import',component:ImportComponent},
  {path:'addnewcompany',component:AddnewcompanyComponent},
  {path:'updatecompany',component:UpdatecompanyComponent},
  {path:'deletecompany',component:DeletecompanyComponent},
  {path:'userlanding',component:UserlandingComponent},
  {path:'useripo',component:UseripoComponent},
  {path:'companyrelatedata',component:CompanyrelatedataComponent},
  {path:'stockexchange',component:StockexchangeComponent},
  {path:'stockexchanges',component:StockexchangesComponent},
  {path:'updatestockexchange',component:UpdatestockexchangeComponent},
 
  
  {path:'stockprice',component:StockpriceComponent},
  {path:'stockprices',component:StockpricesComponent},
  
  {path:'companies',component:CompaniesComponent},
  
  // {path:'pipes',component:PipesComponent},
  {path:'**',component: HomeComponent}
  
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
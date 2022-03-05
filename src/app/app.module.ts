import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AppointmentsModule } from './appointments/appointments.module';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoaderService } from './shared/loader.service';
import { MatDatepickerModule } from '@angular/material/datepicker';
import {MatCardModule} from '@angular/material/card';
@NgModule({
  declarations: [AppComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AppointmentsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatDatepickerModule,
    MatCardModule
  ],
  providers: [LoaderService],
  bootstrap: [AppComponent],
})
export class AppModule {}

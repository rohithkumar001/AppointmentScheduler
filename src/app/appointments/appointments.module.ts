import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AppointmentsRoutingModule } from './appointments-routing.module';
import { AppointmentRescheduleComponent } from './appointment-reschedule/appointment-reschedule.component';
import { AppointmentCalendarComponent } from './appointment-reschedule/appointment-calendar/appointment-calendar.component';
import { MatButtonModule } from '@angular/material/button';
import {
  BookSlot,
  BOOK_SLOT_TOKEN,
} from './appointment-reschedule/appointment-calendar/book-slot';
import { DayPipe } from '../shared/pipes/day.datepipe';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { AppointmentBoxDateComponent } from './appointment-reschedule/appointment-box-date/appointment-box-date.component';
import { MatDatepickerModule } from '@angular/material/datepicker';
import {MatCardModule} from '@angular/material/card';
import { AppointmentsBookedComponent } from './appointments-booked/appointments-booked.component';
@NgModule({
  declarations: [
    AppointmentRescheduleComponent,
    AppointmentCalendarComponent,
    DayPipe,
    AppointmentBoxDateComponent,
    AppointmentsBookedComponent,
  ],
  imports: [
    CommonModule,
    AppointmentsRoutingModule,
    MatButtonModule,
    MatProgressSpinnerModule,
    MatDatepickerModule,
    MatCardModule
  ],
  providers: [
    {
      provide: BOOK_SLOT_TOKEN,
      useValue: BookSlot.create,
    },
  ],
})
export class AppointmentsModule {}

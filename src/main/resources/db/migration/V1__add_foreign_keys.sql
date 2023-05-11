alter TABLE appointment
ADD FOREIGN KEY (patient_id) REFERENCES patient(patient_id);

alter table appointment
add foreign key (doctor_id) references doctor(doctor_id);

alter table appointment
add foreign key (location_id) references locations(location_id);

alter table doctor
add foreign key (person_id) references person(person_id);

alter table doctor
add foreign key (speciality_id) references speciality(speciality_id);

alter table doctor
add foreign key (timesheet_id) references timesheet(timesheet_id);

alter table patient
add foreign key (person_id) references person(person_id);

alter table timesheet
add foreign key (location_id) references locations(location_id);

alter table personcontact
add foreign key (contact_id) references contact(contact_id);

alter table locationcontact
add foreign key (contact_id) references contact(contact_id);

alter table person
add foreign key (person_contact_id) references personcontact(person_contact_id);

alter table locations
add foreign key (location_contact_id) references locationcontact(location_contact_id);
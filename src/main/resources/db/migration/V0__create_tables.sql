create table appointment (
    appointment_id serial primary key,
    appointment_date date not null,
    appointment_time time not null,
    appointment_duration_in_minutes int not null,
    appointment_number int not null,
    patient_comment varchar(150),
    patient_id int not null,
    doctor_id int not null,
    location_id int not null
);

create table contact (
    contact_id serial primary key,
    type varchar(50) not null,
    contact_value varchar(50) not null
);

create table doctor (
    doctor_id serial primary key,
    intoduction varchar(100) not null,
    person_id int not null,
    timesheet_id int not null,
    speciality_id int not null
);

create table locations (
    location_id serial primary key,
    address varchar(50) not null,
    details varchar(100) not null,
    opens time not null,
    closes time not null,
    price decimal not null,
    location_contact_id int not null
);

create table locationContact (
    location_contact_id serial primary key,
    contact_id int not null
);

create table patient (
    patient_id serial primary key,
    blood_type varchar(10) not null,
    has_allergy boolean not null,
    has_chronicle_disease boolean not null,
    person_id int not null
);

create table person (
    person_id serial primary key,
    first_name varchar(30) not null,
    last_name varchar(30) not null,
    p_id int not null,
    sex varchar(30) not null,
    person_contact_id int not null
);

create table personContact (
    person_contact_id serial primary key,
    contact_id int not null
);

create table speciality(
    speciality_id serial primary key,
    speciality_name varchar(50) not null,
    description varchar(150) not null
);

create table timesheet(
    timesheet_id serial primary key,
    day_of_week varchar(50) not null,
    start_working time not null,
    end_working time not null,
    exception_date date,
    location_id int not null
);
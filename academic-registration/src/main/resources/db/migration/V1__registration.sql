CREATE TABLE public.registration_master(
	registration_id varchar NOT NULL,
	candidate_name varchar NULL,
	course_id int2 NULL,
	CONSTRAINT registration_master_pk PRIMARY KEY (registration_id)
);
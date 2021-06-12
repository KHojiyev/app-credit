
INSERT INTO public.passport ( birth_date, due_date, family_name, first_name, given_date, given_from, last_name, nationality, other_infos, passport_number, passport_serial) VALUES ( '1992-02-15 00:00:00.000000', '2026-07-16 00:00:00.000000', 'Ahmedovich', 'Ahmad', '2016-07-18 00:00:00.000000', 'Chilonzor IIB', 'Ahmedov', 'Uzbek', null, 1234567, 'AA');
INSERT INTO public.passport ( birth_date, due_date, family_name, first_name, given_date, given_from, last_name, nationality, other_infos, passport_number, passport_serial) VALUES ( '1993-12-01 00:00:00.000000', '2028-09-29 00:00:00.000000', 'Sadriddin o''g''li', 'Temur', '2001-08-19 00:00:00.000000', 'Mirzo-Ulugbek IIB', 'Xojiboyev', 'uzbek', '', 2345612, 'BB');
INSERT INTO public.passport ( birth_date, due_date, family_name, first_name, given_date, given_from, last_name, nationality, other_infos, passport_number, passport_serial) VALUES ( '1996-06-04 00:00:00.000000', '2027-01-05 00:00:00.000000', 'Sayfiddinovich', 'Bobur', '1995-06-02 00:00:00.000000', 'Yangiqorgon IIB', 'Xojiyev', 'uzbek', null, 1231231, 'AB');
INSERT INTO public.passport ( birth_date, due_date, family_name, first_name, given_date, given_from, last_name, nationality, other_infos, passport_number, passport_serial) VALUES ( '1996-06-04 00:00:00.000000', '2027-01-05 00:00:00.000000', 'Sayfiddinovich', 'Shokir', '1995-06-02 00:00:00.000000', 'Uchqorgon IIB', 'Akromov', 'uzbek', null, 1591591, 'BA');

INSERT INTO public.users ( extra_infos, password, user_name, passport_id) VALUES ( null, 'asd123', 'Temur', 3);
INSERT INTO public.users ( extra_infos, password, user_name, passport_id) VALUES ( null, 'asd123', 'Bobur', 2);
INSERT INTO public.users ( extra_infos, password, user_name, passport_id) VALUES ( null, 'asd123', 'Ahmad', 1);

INSERT INTO public.role ( role_name) VALUES ( 'USER');
INSERT INTO public.role ( role_name) VALUES ( 'MANAGER');
INSERT INTO public.role ( role_name) VALUES ( 'DIRECTOR');
INSERT INTO public.role ( role_name) VALUES ( 'ADMIN');


INSERT INTO public.users_role (user_id, role_id) VALUES (1, 1);
INSERT INTO public.users_role (user_id, role_id) VALUES (2, 1);
INSERT INTO public.users_role (user_id, role_id) VALUES (3, 1);

INSERT INTO "Cafeteria"(type, preis)
	VALUES ('spaghetti', 10);
INSERT INTO "Cafeteria"(type, preis)
	VALUES ('Nudeln', 23);
INSERT INTO "Getränk"(type, preis)
	VALUES ('Wasser', 5);

INSERT INTO "Rolle"(name)
	VALUES ('admin');
INSERT INTO "Rolle"(name)
	VALUES ('mitglied');

INSERT INTO "Benutzer"(email, nachname, vorname, password, rolle_id)
	VALUES ('petermueller@gmail.com', 'Peter', 'Mueller', 'Mueller123', 1);
INSERT INTO "Benutzer"(email, nachname, password, vorname, rolle_id)
	VALUES ('mariamueller@gmail.com','maria', 'Mueller', 'maria123', 2);
INSERT INTO "Benutzer"(email, nachname, password, vorname, rolle_id)
	VALUES ('besucher@besucher.com','besucher', 'besucher', 'besucher', 2);

INSERT INTO cafeteria_benutzer(
	cafeteria_id, benutzer_id)
	VALUES (1, 1);
INSERT INTO cafeteria_benutzer(
	cafeteria_id, benutzer_id)
	VALUES (2, 1);
INSERT INTO cafeteria_benutzer(
	cafeteria_id, benutzer_id)
	VALUES (3, 1);

INSERT INTO "Raum"(category, "ReservierungsStatus", name)
    VALUES ('MeetingRaum', FALSE, 'MeetingRaum');
INSERT INTO "Raum"(category, "ReservierungsStatus", name)
    VALUES ('MeetingRaum2', TRUE, 'MeetingRaum2');

INSERT INTO "Buchung"(date, "halfday", "status", "stornierung", raum_id, benutzer_id)
    VALUES ('2022-30-07', TRUE, FALSE, TRUE, 1, 1);
INSERT INTO "Buchung"(date, "halfday", "status", "stornierung", raum_id, benutzer_id)
    VALUES ('2022-05-05', FALSE, TRUE, TRUE, 2, 2);
INSERT INTO "Buchung"(date, "halfday", "status", "stornierung", raum_id, benutzer_id)
    VALUES ('2022-06-07', FALSE, FALSE,TRUE,  1, 3);
    
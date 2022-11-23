INSERT INTO cafeteria (id, preis, type) VALUES (1, 2.4,'spaghetti');
INSERT INTO cafeteria (id, preis, type) VALUES (2, 3.4,'Falafel');


INSERT INTO rolle(id, titel) VALUES (1, 'admin');
INSERT INTO rolle(id, titel) VALUES (2, 'mitglied');

INSERT INTO benutzer (rolle_id, cafeteria_id, vorname, password, nachname, email, id)
	VALUES (1, 1, 'Peter', 'Mueller123', 'Mueller','petermueller@gmail.com', 1);

INSERT INTO benutzer (rolle_id, cafeteria_id, vorname, password, nachname, email, id)
	VALUES (2, 2, 'Abdullah', 'Abdu123', 'Abdullah','abduii@gmail.com', 2);

INSERT INTO cafeteria_benutzer(
	cafeteria_id, benutzer_id)
	VALUES (1, 1);
INSERT INTO cafeteria_benutzer(
	cafeteria_id, benutzer_id)
	VALUES (2, 2);

INSERT INTO raum(reservierungstatus, name)
    VALUES (FALSE, 'MeetingRaum');
INSERT INTO raum(reservierungstatus, name)
    VALUES (TRUE, 'MeetingRaum2');

INSERT INTO buchung(date, halfday, status, stornierung, raum_id, benutzer_id)
    VALUES ('2022-07-07', TRUE, FALSE, TRUE, 1, 1);
INSERT INTO buchung(date, halfday, status, stornierung, raum_id, benutzer_id)
    VALUES ('2022-05-05', FALSE, TRUE, TRUE, 2, 2);
INSERT INTO buchung(date, halfday, status, stornierung, raum_id, benutzer_id)
    VALUES ('2022-06-07', FALSE, FALSE,TRUE,  2, 1);
    
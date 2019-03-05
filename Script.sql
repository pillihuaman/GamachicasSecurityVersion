--<ScriptOptions statementTerminator=";"/>

CREATE TABLE clothing (
);

CREATE TABLE parentMenu (
);

CREATE TABLE Menu (
);

CREATE TABLE color (
);

CREATE TABLE clothingline (
);

CREATE TABLE stock (
);

CREATE TABLE parameter (
);

CREATE TABLE users (
);

CREATE TABLE Detailtemptpay (
);

CREATE TABLE temptpayheader (
);

CREATE TABLE imagen (
	idimagen INT NOT NULL,
	idclothing INT NOT NULL,
	imagendata LONGBLOB,
	url VARCHAR(200) NOT NULL,
	position4d VARCHAR(200) NOT NULL,
	DESCRIPTION VARCHAR(500),
	idusercreate INT NOT NULL,
	STATUS BIT,
	createdate TIMESTAMP DEFAULT 'CURRENT_TIMESTAMP' NOT NULL,
	updatedate TIMESTAMP DEFAULT '0000-00-00 00:00:00' NOT NULL
);

CREATE TABLE Groupparameter (
);

CREATE TABLE sizes (
);


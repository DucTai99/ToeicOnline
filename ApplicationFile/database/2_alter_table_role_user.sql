USE toeiconline;

ALTER TABLE user ADD COLUMN roleid BIGINT;

ALTER TABLE user ADD CONSTRAINT fk_user_role FOREIGN KEY (roleid) REFERENCES role(roleid);
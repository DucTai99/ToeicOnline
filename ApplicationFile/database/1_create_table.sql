USE toeiconline;

CREATE TABLE user(
                     userid BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(255) NULL,
                     password VARCHAR(255) NULL,
                     fullname VARCHAR(300) NULL,
                     createdate TIMESTAMP NULL
);

CREATE TABLE role(
                     roleid BIGINT NOT NULL PRIMARY KEY,
                     name VARCHAR(100) NULL
)
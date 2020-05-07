USE toeiconline;

CREATE TABLE user
(
    userid     BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(255) NULL,
    password   VARCHAR(255) NULL,
    fullname   VARCHAR(300) NULL,
    createdate TIMESTAMP    NULL
);

CREATE TABLE role
(
    roleid BIGINT       NOT NULL PRIMARY KEY,
    name   VARCHAR(100) NULL
);

CREATE TABLE listenguideline
(
    listenguidelineid BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title             VARCHAR(512) NULL,
    image             VARCHAR(255) NULL,
    context           TEXT         NULL,
    createdate        TIMESTAMP    NULL,
    modifieddate      TIMESTAMP    NULL
);

CREATE TABLE comment
(
    commentid         BIGINT    NOT NULL PRIMARY KEY AUTO_INCREMENT,
    context           TEXT      NULL,
    userid            BIGINT    NULL,
    listenguidelineid BIGINT    NULL,
    createdate        TIMESTAMP NULL
);
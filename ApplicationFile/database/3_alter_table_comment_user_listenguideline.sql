USE toeiconline;

ALTER TABLE comment ADD CONSTRAINT fk_user_comment FOREIGN KEY (commentid) REFERENCES  user(userid);
ALTER TABLE comment ADD CONSTRAINT fk_listenguideline_comment FOREIGN KEY (commentid) REFERENCES  listenguideline(listenguidelineid);
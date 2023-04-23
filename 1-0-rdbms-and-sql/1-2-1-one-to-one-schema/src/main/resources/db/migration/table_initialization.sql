CREATE TABLE IF NOT EXISTS users(
    id Bigint,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    email  varchar(255) NOT NULL,
    birthdate date NOT NULL ,
    CONSTRAINT users_PK PRIMARY KEY (id),
    CONSTRAINT users_email_AK UNIQUE(email)
    );

CREATE TABLE IF NOT EXISTS profiles(
    profiles_id Bigint,
    city varchar(255),
    job_position varchar(255),
    company varchar(255),
    education varchar(255),
    CONSTRAINT profiles_PK PRIMARY KEY (work_profiles_id),
    CONSTRAINT work_profiles_users_FK FOREIGN KEY(work_profiles_id) REFERENCES users


    );

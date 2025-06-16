CREATE TABLE IF NOT EXISTS sporingslogg
(
    id                       BIGSERIAL PRIMARY KEY,
    "tidspunkt"              TIMESTAMP   NOT NULL,
    "innhold"                JSON        NOT NULL,
    );
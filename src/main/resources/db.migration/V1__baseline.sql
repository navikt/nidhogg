CREATE TABLE IF NOT EXISTS brevredigering
(
    id                       BIGSERIAL PRIMARY KEY,
    "tidspunkt"              TIMESTAMP   NOT NULL,
    "innhold"                JSON        NOT NULL,
    );
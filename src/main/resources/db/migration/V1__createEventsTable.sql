CREATE TABLE events (
    id UUID PRIMARY KEY,
    event_name VARCHAR(255) NOT NULL,
    event_description TEXT,
    event_location VARCHAR(255) NOT NULL,
    event_capacity INTEGER NOT NULL,
    event_identifier VARCHAR(255) NOT NULL UNIQUE,
    event_type VARCHAR(50) NOT NULL,
    event_status VARCHAR(50) NOT NULL,
    event_initial_date TIMESTAMP NOT NULL,
    event_final_date TIMESTAMP NOT NULL
);

CREATE INDEX idx_event_identifier ON events(event_identifier);
CREATE INDEX idx_event_status ON events(event_status);
CREATE INDEX idx_event_type ON events(event_type);

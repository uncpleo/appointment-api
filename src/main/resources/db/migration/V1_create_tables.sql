CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE appointment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    date DATE NOT NULL,
    project VARCHAR(255) NOT NULL,
    query TEXT NOT NULL,
    status VARCHAR(50) DEFAULT 'PENDING',
    client_id BIGINT,
    agent_id BIGINT,
    assigned_date DATE,
    closed_date DATE,
    FOREIGN KEY (client_id) REFERENCES user (id),
    FOREIGN KEY (agent_id) REFERENCES user (id)
);

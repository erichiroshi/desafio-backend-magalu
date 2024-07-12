-- Create sequence for notifications
CREATE SEQUENCE tb_notifications_seq START WITH 1 INCREMENT BY 50;

-- Create tb_channel table
CREATE TABLE tb_channel (
    channel_id BIGSERIAL PRIMARY KEY,
    description VARCHAR(255)
);

-- Create tb_status table
CREATE TABLE tb_status (
    status_id BIGSERIAL PRIMARY KEY,
    description VARCHAR(255)
);

-- Create tb_notifications table
CREATE TABLE tb_notifications (
    notification_id BIGSERIAL PRIMARY KEY,
    date_time TIMESTAMP(6),
    destination VARCHAR(255),
    message VARCHAR(255),
    channel_id BIGINT, -- Corrected column name
    status_id BIGINT,
    CONSTRAINT fk_channel_id FOREIGN KEY (channel_id) REFERENCES tb_channel(channel_id),
    CONSTRAINT fk_status_id FOREIGN KEY (status_id) REFERENCES tb_status(status_id)
);

-- Optionally, add ON DELETE CASCADE or other actions as needed for foreign keys
-- ALTER TABLE tb_notifications
--    ADD CONSTRAINT fk_channel_id FOREIGN KEY (channel_id) REFERENCES tb_channel(channel_id) ON DELETE CASCADE;
-- ALTER TABLE tb_notifications
--    ADD CONSTRAINT fk_status_id FOREIGN KEY (status_id) REFERENCES tb_status(status_id) ON DELETE CASCADE;

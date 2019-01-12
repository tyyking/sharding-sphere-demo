CREATE TABLE t_user_0 (
  user_id  BIGINT        NOT NULL PRIMARY KEY,
  username NVARCHAR(100) NOT NULL,
  PASSWORD NVARCHAR(100) NOT NULL
);

CREATE TABLE t_user_1 (
  user_id  BIGINT        NOT NULL PRIMARY KEY,
  username NVARCHAR(100) NOT NULL,
  PASSWORD NVARCHAR(100) NOT NULL
);

CREATE TABLE t_user_2 (
  user_id  BIGINT        NOT NULL PRIMARY KEY,
  username NVARCHAR(100) NOT NULL,
  PASSWORD NVARCHAR(100) NOT NULL
);

CREATE TABLE t_order_0 (
  order_id BIGINT NOT NULL PRIMARY KEY,
  user_id  BIGINT    NOT NULL
);

CREATE TABLE t_order_1 (
  order_id BIGINT NOT NULL PRIMARY KEY,
  user_id  BIGINT    NOT NULL
);

CREATE TABLE t_order_2 (
  order_id BIGINT NOT NULL PRIMARY KEY,
  user_id  BIGINT    NOT NULL
);

CREATE TABLE t_order_item_0 (
  order_item_id BIGINT NOT NULL PRIMARY KEY,
  order_id      BIGINT    NOT NULL
);

CREATE TABLE t_order_item_1 (
  order_item_id BIGINT NOT NULL PRIMARY KEY,
  order_id      BIGINT    NOT NULL
);

CREATE TABLE t_order_item_2 (
  order_item_id BIGINT NOT NULL PRIMARY KEY,
  order_id      BIGINT    NOT NULL
);

CREATE TABLE t_config (
  id   BIGINT       NOT NULL PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL
);

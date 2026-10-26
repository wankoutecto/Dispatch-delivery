create table delivery_job(
    id bigint generated always as identity primary key,
    order_id varchar(50) not null,
    pick_up_address varchar not null,
    delivery_address varchar not null,
    status varchar(50) not null,
    created_at timestamp not null,

    constraint uk_delivery_order_id unique (order_id)

);
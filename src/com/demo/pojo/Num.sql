-- Create the table for class Num

create table if not exists num (
  `id` bigint(18) not null primary key auto_increment,
  `top_d` float(10) default null,
  `bottom_d` float(10) default null,
  `left_d` float(10) default null,
  `right_d` float(10) default null,
  `dot` varchar(300) default null
) engine=InnoDB default charset=utf8 auto_increment=1;
select city, length(city) from ((select city, length(city) from station order by length(city),city asc limit 1) union (select city, length(city) from station order by length(city),city desc limit 1));

select case when a+b < c or a+c < b or b+c<a then 'Not A Triangle' when a=b and b=c then 'Equilateral' when a=b or b=c or a=c then 'Isosceles' when a!= b and b!= c and a!= c then 'Scalene' else 'Not A Triangle' end as triangle_type from triangles;

select case when p is null then 'Root' when n not in (select distinct p from bst) then 'Leaf' else 'Inner' end as node_type from BST;
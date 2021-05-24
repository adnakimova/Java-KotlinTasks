(select CITY,char_length(CITY) from STATION where char_length(CITY) = (select char_length(CITY) from STATION order by char_length(CITY) LIMIT 1)  
Order by CITY LIMIT 1) UNION ALL (select CITY,char_length(CITY) from STATION  
where char_length(CITY)=(select char_length(CITY)  from STATION  order by char_length(CITY) DESC LIMIT 1)  
Order by CITY DESC LIMIT 1)  
ORDER BY char_length(CITY);

package db;
/**
 * 
 * MYSQL database schema :ooaddatabase
 * user :root
 * pass :root
 * 
 */
public interface MyDB {

	String USER="root";
	String PASS="root";
	String CONN_URL="jdbc:mysql://127.0.0.1:3306/ooaddatabase";
	
	
}
/**
CREATE TABLE `customer` (
`userId` char(20) NOT NULL,
`password` char(10) DEFAULT NULL,
`name` char(20) DEFAULT NULL
)


jdbc:mysql://127.0.0.1:3306/coursedatabase?user=coursedatabase_admin

*/

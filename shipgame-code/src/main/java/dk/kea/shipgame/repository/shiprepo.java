
package dk.kea.shipgame.repository;

import dk.kea.shipgame.Model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShipRepo {

   @Autowired
   JdbcTemplate template;

   public List<Ship> fetchAllShips(){
      String sql = " SELECT * FROM SHIPS";

      RowMapper<Ship> rowMapper = new BeanPropertyRowMapper<>(Ship.class);
              return template.query(sql, rowMapper);
   }

   public Ship findShipById(int shipId){
      //sql query der finder person vha. id
      String sql ="SELECT * FROM SHIPS WHERE shipId=?";
      //instantier rowmapper til at mappe query result til person object
      RowMapper<Ship> rowMapper = new BeanPropertyRowMapper<>(Ship.class);
      //udfør query med JdbcTemplate
      return template.queryForObject(sql, rowMapper, shipId);
   }

}

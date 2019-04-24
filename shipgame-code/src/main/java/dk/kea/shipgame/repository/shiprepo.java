
package dk.kea.shipgame.repository;

import dk.kea.shipgame.Model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class shiprepo {

   @Autowired
   JdbcTemplate template;

   public List<Ship> fetchAllShips(){
      String sql = " SELECT * FROM SKIBE";

      RowMapper<Ship> rowMapper = new BeanPropertyRowMapper<>(Ship.class);
              return template.query(sql, rowMapper);
   }

}

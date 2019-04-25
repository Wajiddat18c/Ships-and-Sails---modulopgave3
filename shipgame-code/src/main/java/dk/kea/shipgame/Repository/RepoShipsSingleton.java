package dk.kea.shipgame.Repository;

import dk.kea.shipgame.Model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepoShipsSingleton {


    @Autowired
    JdbcTemplate template;

    public List<Ship> getShips(){
        //Hent skibe fra SQL.
        String sql = "SELECT * FROM ships";
        RowMapper<Ship> rMapShips = new BeanPropertyRowMapper<>(Ship.class);

        return template.query(sql, rMapShips);
    }

}

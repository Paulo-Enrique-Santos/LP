package sptech.school.exemplo.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {
    public static void main(String[] args) {
        Database database = new Database();
        JdbcTemplate connection = database.getConnection();
        
        
        
        List<Filme> resultado = connection.query("select * from filme", 
                new BeanPropertyRowMapper(Filme.class)
                );
        
        for (Filme filme : resultado) {
            System.out.println("Nome: " + filme.getNome());
        }
    }
}

package polimorfismo.classes;

public class DatabaseDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("salvandi dados no banco de dados");
    }
}
 
package ispw.dao;

import com.example.bodybuild.model.*;

public interface LoginAndRegistrationDAO {
    //metodi per il login e la registrazione
    boolean emailExists(String email);
    boolean insertUser(Credentials credentials);
    void registerCustomer(Customer customer);
    void registerTrainer(Trainer trainer);
    void login(Credentials credentials);
    void retrieveCustomer(Customer customer);
    void retrieveTrainer(Trainer trainer);
    void removeCustomer(Customer customer);
}

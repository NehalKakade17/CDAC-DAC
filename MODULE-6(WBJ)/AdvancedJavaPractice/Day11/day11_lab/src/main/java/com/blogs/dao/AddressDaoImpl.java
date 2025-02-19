package com.blogs.dao;

import static com.blogs.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.blogs.pojos.Address;
import com.blogs.pojos.User;

public class AddressDaoImpl implements AddressDao {

    @Override
    public String assignUserAddress(Long userId, Address newAdr) {
        String mesg = "Assigning address failed!";
        
        // 1. Get session from session factory
        Session session = getFactory().getCurrentSession();
        
        // 2. Begin a transaction
        Transaction tx = session.beginTransaction();
        
        try {
            // 3. Fetch the User object by its ID
            User user = session.get(User.class, userId);

            // 4. Check if the user exists
            if (user != null) {
                // 5. Associate the new address with the user
                user.setUserAddress(newAdr);  // Set the new address for the user
                
                // 6. Save or update the address and user
                session.saveOrUpdate(newAdr);  // Save the new address
                session.saveOrUpdate(user);    // Save or update the user with the new address
                
                // 7. Commit the transaction
                tx.commit();
                
                mesg = "Address assigned successfully!";
            } else {
                mesg = "User not found!";
            }
        } catch (RuntimeException e) {
            // 8. Rollback transaction in case of error
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            // re-throw exception to be handled by caller
            throw e;
        }
        
        // 9. Return the message based on success/failure
        return mesg;
    }
}




package example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.demo.model.Ticket;
import example.demo.repository.TicketRepo;
@Service
public class TicketService {
    @Autowired
    TicketRepo mr;
    public Ticket create (Ticket mm)
    {
        return mr.save(mm);
    }
    public List<Ticket> getAll()
    {
        return mr.findAll();
    }
    public Ticket getMe(int id)
    {
        return mr.findById(id).orElse(null);
    }
    public boolean updateDetails(int id,Ticket mm)
        {
            if(this.getMe(id)==null)
            {
                return false;
            }
            try{
                mr.save(mm);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteProduct(int id)
        {
            if(this.getMe(id) == null)
            {
                return false;
            }
            mr.deleteById(id);
            return true;
        }

}
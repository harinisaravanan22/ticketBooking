package example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import example.demo.model.Ticket;
public interface TicketRepo extends JpaRepository<Ticket,Integer>{
    
}
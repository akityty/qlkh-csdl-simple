package konkon.service.Impl;

import konkon.model.Customer;
import konkon.repository.CustomerRepository;
import konkon.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
  @Autowired
  private CustomerRepository customerRepository;

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

  @Override
  public Customer findById(Long id) {
    return customerRepository.findById(id);
  }

  @Override
  public void save(Customer model) {
    customerRepository.save(model);
  }

  @Override
  public void remove(Long id) {
customerRepository.remove(id);
  }
}

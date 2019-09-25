package konkon.repository;

import java.util.List;

public interface GeneralRepository<E> {
  List<E> findAll();

  E findById(Long id);

  void save(E model);

  void remove(Long id);
}

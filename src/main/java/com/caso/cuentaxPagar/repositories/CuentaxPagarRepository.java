package com.caso.cuentaxPagar.repositories;
import com.caso.cuentaxPagar.models.CuentaxPagar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CuentaxPagarRepository extends JpaRepository <CuentaxPagar, Integer> {
    List<CuentaxPagar> findAll();

}

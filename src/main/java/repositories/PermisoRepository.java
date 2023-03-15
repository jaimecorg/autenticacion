package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaimecorg.autenticacion.model.Permiso;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, Long>{

}

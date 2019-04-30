package cz.uhk.dbs2.bamis.repository;

import cz.uhk.dbs2.bamis.model.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author David Sladecek
 */
@Repository
public interface GoodRepository extends JpaRepository<Good,Integer> {

  // @Query("SELECT g FROM Good g WHERE Good.kategoriezasilkyId>3")
  // List<Good> getGoodsWithKategoryHighetThanThree();
}

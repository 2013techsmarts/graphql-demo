package co.smarttechie.graphqldemo.repository;


import co.smarttechie.graphqldemo.entities.Seo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeoRepository extends JpaRepository<Seo, String> {
}

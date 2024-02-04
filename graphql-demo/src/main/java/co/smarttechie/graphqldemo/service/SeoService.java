package co.smarttechie.graphqldemo.service;

import java.util.Optional;

import co.smarttechie.graphqldemo.entities.Seo;
import co.smarttechie.graphqldemo.repository.SeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
@Transactional
public class SeoService {
	@Autowired
	private SeoRepository seoRepository;

	public Optional<Seo> getProduct(String id) {
		return this.seoRepository.findById(id);
	}
}

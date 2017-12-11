package br.com.desafio.netshoes.automacaotestes.configuration.bean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryTest {
	private Map<String, Object> repository = new HashMap<String, Object>();

	public void setCollection(String key, Object value) {
		if (StringUtils.isEmpty(key))
			throw new NullPointerException("Chave não pode ser null ou vazio.");
		repository.put(key, value);
	}

	public Object getCollection(String key) {
		if (StringUtils.isEmpty(key)) 
			throw new NullPointerException("Chave não pode ser null ou vazio.");
		return getCollection(key, Object.class);
	}

	public <T> T getCollection(String key, Class<T> type) {
		return type.cast(repository.get(key));
	}

	public Object getCollectionDefault(String key) {
		return getCollection(key, String.class);
	}
}

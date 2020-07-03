package kr.co.modeunwine.wine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.modeunwine.wine.repository.WineMainMapper;

@Service
public class WineMainService {

	@Autowired
	private WineMainMapper wineMainMapper;
}

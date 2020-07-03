package kr.co.modeunwine.grape.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.modeunwine.grape.repository.GrapeMainMapper;

@Service
public class GrapeMainService {

	@Autowired
	private GrapeMainMapper grapeMainMapper;
}

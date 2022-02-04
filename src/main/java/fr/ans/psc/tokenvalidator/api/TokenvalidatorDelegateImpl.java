package fr.ans.psc.tokenvalidator.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TokenvalidatorDelegateImpl implements TokenvalidatorApiDelegate {

	@Override
	//Get Token dans le path
	public ResponseEntity<String> tokenValidator(String token){
		return new ResponseEntity<>(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
	}
	
	@Override
	//POst token dans le headers
	 public ResponseEntity<String> isTokenValid() {
	        return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);

	    }
}
